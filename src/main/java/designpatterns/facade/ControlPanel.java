package designpatterns.facade;

class ControlPanel {
    private AutomaticParkingSystem parkingSystem;
    private AdaptiveCruiseControlSystem cruiseControlSystem;
    private CollisionAvoidanceSystem collisionSystem;

    public ControlPanel() {
        this.parkingSystem = new AutomaticParkingSystem();
        this.cruiseControlSystem = new AdaptiveCruiseControlSystem();
        this.collisionSystem = new CollisionAvoidanceSystem();
    }

    public void park() {
        // לוגיקה מורכבת להחנות את הרכב
        parkingSystem.park();
    }

    public void activateCruiseControl() {
        // שולט במהירות של המכונית ושומר מרכב מרכבים אחרים
        cruiseControlSystem.activate();
    }

    public void avoidCollision() {
        // Need to control the speed of the car, the distance between
        collisionSystem.avoid();
    }

    public void driveToHomeAndPark() {
        System.out.println("Taking you home...");
        activateCruiseControl();
        avoidCollision();
        park();
    }
}