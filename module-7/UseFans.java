/* Roxanne Buenaventura
CSD 402
Assignment 7.2: Programming Assignment */

import java.util.ArrayList;

public class UseFans {
    // create a main method that creates an ArrayList of Fan objects, adds four Fan objects to the ArrayList, and displays the state of each Fan object using the displayFan() method.
    public static void main(String[] args) {
        // create an ArrayList of Fan objects
        ArrayList<Fan> fans = new ArrayList<>();
        // create four Fan objects and add them to the ArrayList
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.SLOW, true, 8, "pink");
        Fan fan3 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan4 = new Fan(Fan.MEDIUM, true, 9, "green");
        // add the Fan objects to the ArrayList
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);
        // display the state of each Fan object using the displayFan() method
        System.out.println("Displaying all fans:");
        displayFans(fans);
    }

    // create a method named displayFan() that takes a Fan object as an argument and displays the state of the Fan object
    public static void displayFan(Fan fan) {
        // create a variable to hold the name of the speed
        String speedName = "STOPPED";
        // use if statements to determine the name of the speed based on the value of the speed field
        if (fan.getSpeed() == Fan.STOPPED) {
            speedName = "STOPPED";
        } else if (fan.getSpeed() == Fan.SLOW) {
            speedName = "SLOW";
        } else if (fan.getSpeed() == Fan.MEDIUM) {
            speedName = "MEDIUM";
        } else if (fan.getSpeed() == Fan.FAST) {
            speedName = "FAST";
        }
        // display the state of the Fan object 
        System.out.println("Fan speed: " + speedName);
        System.out.println("Fan is on: " + fan.isOn());
        System.out.println("Fan radius: " + fan.getRadius());
        System.out.println("Fan color: " + fan.getColor());
    }

    // create a method named displayFans() that takes an ArrayList of Fan objects as an argument and displays the state of each Fan object using the displayFan() method
    public static void displayFans(ArrayList<Fan> fans) {
        // use a for-each loop to iterate through the ArrayList of Fan objects and display the state of each Fan object using the displayFan() method
        for (Fan fan: fans) {
            displayFan(fan);
            System.out.println();
        }
    }
}
