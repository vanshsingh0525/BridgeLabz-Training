package edumentor;

public class Learner extends User {

    public Learner(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void printDetails() {
        System.out.println("Learner: " + name + ", Email: " + email);
    }
}

