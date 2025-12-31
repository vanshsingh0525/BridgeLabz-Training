package com.objectmodelling.assistedproblems;

public class AnimalTest {

    public static void main(String[] args) {

        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        Animal[] animals = { dog, cat, bird };

        for (Animal animal : animals) {
            animal.makeSound();   // Polymorphic behavior
        }
    }
}

