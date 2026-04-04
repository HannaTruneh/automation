package cleancode.liskov;

public class Implementation {

    public static void main(String[] args) {
        VIPWaitingList vipList = new VIPWaitingList();

        vipList.addUser("Alice", false);
        vipList.addUser("Bob", true);
        vipList.addUser("Charlie", false);

        vipList.processNextUser();
        vipList.processNextUser();
        vipList.processNextUser();
        vipList.processNextUser();
    }

}
