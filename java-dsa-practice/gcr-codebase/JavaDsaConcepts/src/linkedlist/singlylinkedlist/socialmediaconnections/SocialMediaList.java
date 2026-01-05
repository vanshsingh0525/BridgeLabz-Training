package linkedlist.singlylinkedlist.socialmediaconnections;

/*
 * Handles all social media operations
 */
public class SocialMediaList {

    private UserNode head;

    /* ---------------- ADD USER ---------------- */

    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        newUser.next = head;
        head = newUser;
    }

    /* ---------------- SEARCH USER ---------------- */

    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    /* ---------------- FRIEND CONNECTION ---------------- */

    public void addFriend(int userId1, int userId2) {
        UserNode u1 = searchById(userId1);
        UserNode u2 = searchById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(u1, userId2);
        addFriendToList(u2, userId1);

        System.out.println("Friend connection added");
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friends;
        user.friends = newFriend;
    }

    public void removeFriend(int userId1, int userId2) {
        UserNode u1 = searchById(userId1);
        UserNode u2 = searchById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFromFriendList(u1, userId2);
        removeFromFriendList(u2, userId1);

        System.out.println("Friend connection removed");
    }

    private void removeFromFriendList(UserNode user, int friendId) {
        FriendNode temp = user.friends;

        if (temp == null) return;

        if (temp.friendId == friendId) {
            user.friends = temp.next;
            return;
        }

        while (temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    /* ---------------- DISPLAY FRIENDS ---------------- */

    public void displayFriends(int userId) {
        UserNode user = searchById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    /* ---------------- MUTUAL FRIENDS ---------------- */

    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = searchById(id1);
        UserNode u2 = searchById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual friends:");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }

    /* ---------------- COUNT FRIENDS ---------------- */

    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;

            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}