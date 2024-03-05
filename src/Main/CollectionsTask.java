package Main;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {
    private List<User> users;

    public CollectionsTask() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i));
        }
    }

    public User getUserByIndex(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        } else {
            System.out.println("Invalid index. Main.User not found.");
            return null;
        }
    }

    public static void main(String[] args) {
        CollectionsTask collectionsTask = new CollectionsTask();


        collectionsTask.addUser(new User("User1", "user1@example.com"));
        collectionsTask.addUser(new User("User2", "user2@example.com"));
        collectionsTask.addUser(new User("User3", "user3@example.com"));
        collectionsTask.addUser(new User("User4", "user4@example.com"));
        collectionsTask.addUser(new User("User5", "user5@example.com"));


        System.out.println("List of users:");
        collectionsTask.displayUsers();


        int indexToDisplay = 2;
        User userAtIndex = collectionsTask.getUserByIndex(indexToDisplay);
        if (userAtIndex != null) {
            System.out.println("\nMain.User at index " + indexToDisplay + ": " + userAtIndex);
        }
    }
}
