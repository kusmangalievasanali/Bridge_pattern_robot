package robot_bridge;

public class WheeledMovement implements MovementSystem {
    @Override
    public void move() {
        System.out.println("Moving on wheels: rolling smoothly across the floor.");
    }
}