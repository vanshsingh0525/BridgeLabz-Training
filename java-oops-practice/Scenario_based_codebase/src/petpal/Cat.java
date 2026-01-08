package petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }

    public void feed() {
        changeHunger(-15);
        changeMood(5);
    }

    public void play() {
        changeEnergy(-10);
        changeMood(15);
    }

    public void sleep() {
        changeEnergy(20);
    }
}

