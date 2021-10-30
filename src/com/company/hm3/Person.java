package com.company.hm3;

public class Person {
    String surname;
    String name;
    String fathername;

    public Person(String name, String surname, String fathername) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
    }

    public Person(String surnameNamefathername) {
        String[] fullNameOfThePerson;
        String del = " ";
        fullNameOfThePerson = surnameNamefathername.split(del);
        this.surname = fullNameOfThePerson[0];
        this.name = fullNameOfThePerson[1];
        this.fathername = fullNameOfThePerson[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                '}';
    }
}

