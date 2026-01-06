package edumentor;

public class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void printDetails() {
        System.out.println("Instructor: " + name + ", Email: " + email);
    }
}
