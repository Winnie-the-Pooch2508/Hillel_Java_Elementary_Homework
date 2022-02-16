package com.company.hm16;

import java.io.*;
import java.util.Date;

public class FileLogger {
    private final FileLoggerConfiguration fileLoggerDebugConfiguration = new FileLoggerConfiguration(new File("./debug.txt"), LoggingLevel.DEBUG, 100000000, "[%s] The Massage:\n %s");
    private final FileLoggerConfiguration fileLoggerInfoConfiguration = new FileLoggerConfiguration(new File("./info.txt"), LoggingLevel.INFO, 100000000, "[%s] The Massage:\n %s");
    private BufferedReader reader;
    private BufferedWriter writer;

    public FileLogger(String line) {
        try {
            if (line.equals(fileLoggerInfoConfiguration.getLoggingLevel().toString())) {
                createPlace(fileLoggerInfoConfiguration);
            } else if (line.equals(fileLoggerDebugConfiguration.getLoggingLevel().toString())) {
                createPlace(fileLoggerDebugConfiguration);
                createPlace(fileLoggerInfoConfiguration);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

    public void start(String line) throws IOException {
        if (line.equals(fileLoggerInfoConfiguration.getLoggingLevel().toString())) {
            info();
        } else if (line.equals(fileLoggerDebugConfiguration.getLoggingLevel().toString())) {
            debug();
        }
    }

    private void createPlace(FileLoggerConfiguration fileLoggerConfiguration) throws IOException {
        fileLoggerConfiguration.getPlaceForInfo();
        writer = new BufferedWriter(new FileWriter(fileLoggerConfiguration.getPlaceForInfo(), true));
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private void debug() throws IOException {
        while (true) {
            String line = reader.readLine();
            if (line.equals("-end")) {
                System.out.println("Session closed");
                break;
            }
            toDoWriting(line, fileLoggerDebugConfiguration);
            toDoWriting(line, fileLoggerInfoConfiguration);
        }
    }

    private void info() throws IOException {
        while (true) {
            String line = reader.readLine();
            if (line.equals("-end")) {
                System.out.println("Session closed");
                break;
            }
            toDoWriting(line, fileLoggerInfoConfiguration);
        }
    }

    private void toDoWriting(String line, FileLoggerConfiguration fileLoggerConfiguration) {
        try {
            sizeChecking(fileLoggerConfiguration);
            writer.write("[" + new Date() + "]");
            writer.write(String.format(fileLoggerConfiguration.getWritingFormat(), fileLoggerConfiguration.getLoggingLevel(), line));
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while writing to file: " + fileLoggerConfiguration.getPlaceForInfo(), e);
        } catch (FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }

    private void sizeChecking(FileLoggerConfiguration fileLoggerConfiguration) throws FileMaxSizeReachedException {
        if (fileLoggerConfiguration.getPlaceForInfo().length() > fileLoggerConfiguration.getMaxByteSize()) {
            throw new FileMaxSizeReachedException("Your file" + fileLoggerConfiguration.getPlaceForInfo().getPath() + "reached max size = " + fileLoggerConfiguration.getMaxByteSize() + ", your size equals = " + fileLoggerConfiguration.getPlaceForInfo().length());
        }
    }
}