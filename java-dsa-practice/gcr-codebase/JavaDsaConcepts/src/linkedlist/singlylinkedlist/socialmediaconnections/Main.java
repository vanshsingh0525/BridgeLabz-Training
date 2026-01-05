package linkedlist.singlylinkedlist.socialmediaconnections;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialMediaList list = new SocialMediaList();
        int choice;

        do {
            System.out.println("\n=== Social Media Friend System ===");
            System.out.println("1. Add user");
            System.out.println("2. Add friend connection");
            System.out.println("3. Remove friend connection");
            System.out.println("4. Display friends of a user");
            System.out.println("5. Find mutual friends");
            System.out.println("6. Search user by ID");
            System.out.println("7. Search user by name");
            System.out.println("8. Count friends of each user");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    list.addUser(id, name, age);
                }

                case 2 -> {
                    System.out.print("User 1 ID: ");
                    int u1 = sc.nextInt();
                    System.out.print("User 2 ID: ");
                    int u2 = sc.nextInt();
                    list.addFriend(u1, u2);
                }

                case 3 -> {
                    System.out.print("User 1 ID: ");
                    int u1 = sc.nextInt();
                    System.out.print("User 2 ID: ");
                    int u2 = sc.nextInt();
                    list.removeFriend(u1, u2);
                }

                case 4 -> {
                    System.out.print("User ID: ");
                    list.displayFriends(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("User 1 ID: ");
                    int u1 = sc.nextInt();
                    System.out.print("User 2 ID: ");
                    int u2 = sc.nextInt();
                    list.findMutualFriends(u1, u2);
                }

                case 6 -> {
                    System.out.print("User ID: ");
                    UserNode user = list.searchById(sc.nextInt());
                    System.out.println(user != null ? user.name : "User not found");
                }

                case 7 -> {
                    sc.nextLine();
                    System.out.print("Name: ");
                    UserNode user = list.searchByName(sc.nextLine());
                    System.out.println(user != null ? user.userId : "User not found");
                }

                case 8 -> list.countFriends();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
