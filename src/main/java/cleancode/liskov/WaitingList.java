package cleancode.liskov;

import java.util.ArrayList;
import java.util.List;

public class WaitingList {

    protected List<User> users = new ArrayList<>();

    public void addUser(String name, boolean isVip) {
        users.add(new User(name, isVip));
    }

    public void processNextUser() {
        if (!users.isEmpty()) {
            User user = users.remove(0);
            System.out.println("Processing user: " + user);
        } else {
            System.out.println("No users in the waiting list.");
        }
    }
}
