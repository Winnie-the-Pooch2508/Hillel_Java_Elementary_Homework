package com.company.hm5.professions;

import com.company.hm3.Person;

public class Driver extends Person {
    private String surname;
    private String name;
    private String fathername;
    private int drivingExperience;

    public Driver(String surname, String name, String fathername) {
        super(surname, name, fathername);
    }

    public Driver(String surnameNamefathername) {
        super(surnameNamefathername);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}