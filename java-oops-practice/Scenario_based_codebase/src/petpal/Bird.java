package petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet Tweet");
    }

    public void feed() {
        changeHunger(-10);
        changeMood(8);
    }

    public void play() {
        changeEnergy(-5);
        changeMood(12);
    }

    public void sleep() {
        changeEnergy(15);
    }
}

