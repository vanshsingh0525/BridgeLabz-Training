package com.inheritance.hybridinheritance;

public class Waiter extends Person implements Worker {

    private int tableCount;

    public Waiter(int id, String name, int tableCount) {
        super(id, name);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties : Serving " + tableCount + " tables");
    }
}

