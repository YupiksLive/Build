package com.company;

public class PersonBuilder {
    private Person person;
    private String name;
    private String surname;

    public PersonBuilder() {
        person = new Person(this.name, this.surname);
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    public Person build() {
        return person;
    }
}
