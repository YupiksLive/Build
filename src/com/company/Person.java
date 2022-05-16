package com.company;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (this.address.equals(null)) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = "Неизвестен";
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        if (hasAge() && hasAddress()) {
            return "Person{" +
                    "name='" + getName() + '\'' +
                    ", surname='" + getSurname() + '\'' +
                    ", age=" + getAge() +
                    ", address=" + getAddress() +
                    '}';
        } else if (hasAge()) {
            return "Person{" +
                    "name='" + getName() + '\'' +
                    ", surname='" + getSurname() + '\'' +
                    ", age=" + getAge() +
                    '}';
        } else {
            return "Person{" +
                    "name='" + getName() + '\'' +
                    ", surname='" + getSurname() + '\'' +
                    '}';
        }
    }


    @Override
    public int hashCode() {
        return hashCode();
    }


    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder()
                .setSurname(this.surname);
        return child;
    }
}
