package robot_bridge;

public class TrackedMovement implements MovementSystem {
    @Override
    public void move() {
        System.out.println("Moving on tracks: crawling over rough terrain.");
    }
}