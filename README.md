# Bridge Pattern — Robots and Movement Systems

Implementation of the **Bridge** structural design pattern in Java.

## Topic

Robots (behavior) are decoupled from their movement system.
Any robot type can be combined with any movement system at runtime, without changing
the robot's code.

## Pattern Structure

| Role | Class | Description |
|---|---|---|
| Abstraction | `Robot` | Abstract class holding a reference to `MovementSystem` |
| Refined Abstraction | `CombatRobot`, `DomesticRobot` | Two robot types with different high-level behavior |
| Implementor | `MovementSystem` | Interface declaring the low-level `move()` operation |
| Concrete Implementor | `WheeledMovement`, `TrackedMovement` | Two movement implementations |
| Client | `Main` | Combines robots with movement systems and switches implementations at runtime |

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `src/main/java/robot_bridge/Main.java`.
3. Click the green Run button next to `main()`.

## Clean Code Principles Applied

1. **Separation of Abstraction and Implementation** — `Robot` does not know how
   movement is physically performed; `MovementSystem` does not know about robot
   types. No implementor details leak to the client.

2. **Meaningful Names Distinguishing Roles** — `CombatRobot` / `DomesticRobot`
   represent robot behavior; `WheeledMovement` / `TrackedMovement` represent
   movement mechanisms. Names make the two hierarchies clearly distinguishable.

3. **Small, Focused Classes** — each Concrete Implementor has one method and
   one responsibility: performing one specific type of movement.

4. **No Duplicated Logic Between Concrete Implementors** — `WheeledMovement`
   and `TrackedMovement` implement `move()` independently, with no shared or
   copy-pasted code.

5. **Backward-Compatible / Open-Closed Design** — adding a new Concrete
   Implementor (e.g. `FlyingMovement`) requires no changes to `Robot`,
   `CombatRobot`, or `DomesticRobot`.

## Example Output

```
--- Combat Robot on Tracks ---
Combat Robot: Target acquired. Initiating tactical protocols.
Moving on tracks: crawling over rough terrain.

--- Domestic Robot on Wheels ---
Domestic Robot: Scanning room for dust. Optimizing cleaning route.
Moving on wheels: rolling smoothly across the floor.

--- Switching implementation at runtime: Combat Robot on Wheels ---
Combat Robot: Target acquired. Initiating tactical protocols.
Moving on wheels: rolling smoothly across the floor.
```
