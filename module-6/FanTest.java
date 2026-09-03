/* Roxanne Buenaventura
CSD402
Assignment 6.2: Programming Assignment */

public class FanTest {
    public static void main(String[] args) {
        // Create first fan using the default constuctor
        Fan fan1 = new Fan();

        // Print the state of the first fan
        System.out.println("Fan 1:");
        System.out.println(fan1);

        // Create second fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "yellow");
        // Print the state of the second fan
        System.out.println("Fan 2:");
        System.out.println(fan2);

        // Test getters
        System.out.println("Fan 2 speed: " + fan2.getSpeed());
        System.out.println("Fan 2 is on: " + fan2.isOn());
        System.out.println("Fan 2 radius: " + fan2.getRadius());
        System.out.println("Fan 2 color: " + fan2.getColor());

        // Test setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("pink");

        System.out.println("Fan 1 after setting values:");
        System.out.println(fan1);
    }
}
