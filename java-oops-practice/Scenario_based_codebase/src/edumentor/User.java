package edumentor;

public class User {
    public String name;
    public String email;
    public int userId;

    public User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void printDetails() {
        System.out.println("User: " + name + ", Email: " + email);
    }
}

