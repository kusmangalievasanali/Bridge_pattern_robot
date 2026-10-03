package robot_bridge;

public class Main {
    public static void main(String[] args) {

        System.out.println("___Combat Robot on Tracks___");
        Robot combatOnTracks = new CombatRobot(new TrackedMovement());
        combatOnTracks.performTask();
        combatOnTracks.move();

        System.out.println("\n___Domestic Robot on Wheels___");
        Robot domesticOnWheels = new DomesticRobot(new WheeledMovement());
        domesticOnWheels.performTask();
        domesticOnWheels.move();

        System.out.println("\n___Switching implementation at runtime: Combat Robot on Wheels___");
        Robot combatOnWheels = new CombatRobot(new WheeledMovement());
        combatOnWheels.performTask();
        combatOnWheels.move();
    }
}