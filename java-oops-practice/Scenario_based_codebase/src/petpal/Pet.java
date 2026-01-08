import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated attributes
    private int hunger;
    private int energy;
    private int mood;

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        Random random = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = random.nextInt(50) + 30;
        this.energy = random.nextInt(50) + 30;
        this.mood = random.nextInt(50) + 30;
    }

    // Polymorphic method
    public abstract void makeSound();

    // Controlled modification methods
    protected void changeHunger(int value) {
        hunger += value;
        hunger = Math.max(0, Math.min(hunger, 100));
    }

    protected void changeEnergy(int value) {
        energy += value;
        energy = Math.max(0, Math.min(energy, 100));
    }

    protected void changeMood(int value) {
        mood += value;
        mood = Math.max(0, Math.min(mood, 100));
    }

    public void showStatus() {
        System.out.println("Name: " + name +
                ", Hunger: " + hunger +
                ", Energy: " + energy +
                ", Mood: " + mood);
    }
}
