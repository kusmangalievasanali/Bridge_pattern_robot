package robot_bridge;

public class DomesticRobot extends Robot {

    public DomesticRobot(MovementSystem movementSystem) {
        super(movementSystem);
    }

    @Override
    public void performTask() {
        System.out.println("Domestic Robot: Scanning room for dust. Optimizing cleaning route.");
    }
}