package petpal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }

    public void feed() {
        changeHunger(-20);
        changeMood(10);
    }

    public void play() {
        changeEnergy(-15);
        changeMood(20);
    }

    public void sleep() {
        changeEnergy(25);
    }
}

