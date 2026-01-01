package com.objectmodelling.hybridinheritance;

public class Chef extends Person implements Worker {

    private String specialization;

    public Chef(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties : Cooking " + specialization + " dishes");
    }
}

