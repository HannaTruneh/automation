package designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();

        controlPanel.park();
        controlPanel.activateCruiseControl();
        controlPanel.avoidCollision();

        // חיבור של כל הפעולות יחד - קח אותי הביתה
        controlPanel.driveToHomeAndPark();
    }
}
