package robot_bridge;

public class CombatRobot extends Robot {

    public CombatRobot(MovementSystem movementSystem) {
        super(movementSystem);
    }

    @Override
    public void performTask() {
        System.out.println("Combat Robot: Target acquired. Initiating tactical protocols.");
    }
}