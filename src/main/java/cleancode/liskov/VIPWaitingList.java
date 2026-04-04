package cleancode.liskov;

public class VIPWaitingList extends WaitingList {

    @Override
    public void processNextUser() {
        if (!users.isEmpty()) {
            int index = -1;
            for (int i = 0; i < users.size() && index == -1; i++) {
                if (users.get(i).isVip) {
                    index = i;
                }
            }
            User user;
            if (index != -1) {
                user = users.remove(index);
                System.out.println("Processing VIP user: " + user.name);
            } else {
                user = users.remove(0);
                System.out.println("Processing user: " + user.name);
            }
        } else {
            System.out.println("No users in the waiting list");
        }
    }
}


