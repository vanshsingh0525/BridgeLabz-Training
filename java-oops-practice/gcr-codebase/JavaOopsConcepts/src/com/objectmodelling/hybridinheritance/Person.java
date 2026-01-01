package com.objectmodelling.hybridinheritance;

public class Person {

    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayPersonDetails() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

