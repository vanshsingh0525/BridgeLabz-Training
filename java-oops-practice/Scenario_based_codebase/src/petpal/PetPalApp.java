package petpal;

public class PetPalApp {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.makeSound();
        dog.feed();
        dog.play();
        dog.showStatus();

        System.out.println();

        cat.makeSound();
        cat.sleep();
        cat.showStatus();

        System.out.println();

        bird.makeSound();
        bird.play();
        bird.showStatus();
    }
}

