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
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
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
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", address=" + getAddress() +
                '}';
    }

    @Override
    public int hashCode() {
        return hashCode();
    }


    public PersonBuilder newChildBuilder() {
    }
}
