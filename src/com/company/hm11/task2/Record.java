package com.company.hm11.task2;

public class Record {
    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    private String name;
    private String phoneNumber;

    public Record() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Record{" +
                "Name='" + name + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
