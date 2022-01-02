package com.company.hm13;

import java.util.*;

import static java.net.URI.checkPath;


public class FileNavigator {

    public Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

  /*2. Реализовать метод add в классе FileNavigator. Данный метод добавляет файл по указанному пути.
  Если путь уже существует,
  то новый файл необходимо добавить к списку,
  уже связанному с соответствующим путем. ВАЖНО: Путь - уникальное значение и не должно повторяться.*/

    public void add(String path, FileData file) {
        checkPath(path, file);

        if (fileStorage.containsKey(path)) {
            fileStorage.get(path).add(file);

        } else {
            ArrayList<FileData> newFile = new ArrayList<>();
            newFile.add(file);
            fileStorage.put(path, newFile);
        }
    }


    /*3. Реализовать метод find в классе FileNavigator.
    Метод возвращает список файлов связанных с путем переданным в качестве параметра.*/

    public ArrayList<FileData> find(String path) {
        return new ArrayList<>(fileStorage.get(path));
    }

/*4. Реализовать метод filterBySize в классе FileNavigator.
    Метод возвращает список файлов, размер (в байтах) которых не превышает значение переданное
    в качестве параметра.*/

    public ArrayList<FileData> filterBySize(int maxSize) {
        ArrayList<FileData> allowedSize = new ArrayList<>();
        for (ArrayList<FileData> value : fileStorage.values()) {
            for (FileData o : value) {
                if ((o.getSize() <= maxSize)) {
                    allowedSize.add(o);

                }
            }
        }
        return allowedSize;
    }

/*5. Реализовать метод remove в классе FileNavigator.
Метод удаляет путь и связанные с ним файлы, на основании значения пути,
переданного в качестве параметра.
 */

    public void remove(String path) {
        fileStorage.remove(path, fileStorage.get(path));
    }
}
