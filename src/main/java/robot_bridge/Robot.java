package robot_bridge;

public abstract class Robot {
    protected MovementSystem movementSystem;

    public Robot(MovementSystem movementSystem) {
        this.movementSystem = movementSystem;
    }

    public abstract void performTask();

    public void move() {
        movementSystem.move();
    }
}