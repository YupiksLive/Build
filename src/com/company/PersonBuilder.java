package com.company;

public class PersonBuilder {
    private Person person;
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException();
        }
        if (this.age > 0 && this.address.equals(null)) {
            person = new Person(this.name, this.surname, this.age);
        } else if (this.age > 0) {
            person = new Person(this.name, this.surname, this.age, this.address);
        } else {
            person = new Person(this.name, this.surname);
        }
        return person;
    }
}
