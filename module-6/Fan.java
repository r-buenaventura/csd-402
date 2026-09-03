/* Roxanne Buenaventura
CSD402
Assignment 6.2: Programming Assignment */

public class Fan {
    // create contants named STOPPED, SLOW, MEDIUM, and FAST, to hold values of 0, 1 , 2, and 3. 
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // create fields for speed, on/off, radius, and color, with default values of STOPPED, false, 6, and white.
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";
    // create getters and setters for all four fields.
    public int getSpeed() {
    return speed;
   }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // create a no-arg constructor that sets all fields to a default value.
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }
    // create a constructor that takes arguments and sets values.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    // create a toString() method that returns a description of the Fan's state.
    @Override
    public String toString() {
        // create a variable to hold the name of the speed
        String speedName = "Stopped";
        // use if statements to determine the name of the speed based on the value of the speed field
        if (speed == STOPPED) {
            speedName = "STOPPED";
        } else if (speed == SLOW) {
            speedName = "SLOW";
        } else if (speed == MEDIUM) {
            speedName = "MEDIUM";
        } else if (speed == FAST) {
            speedName = "FAST";
        }

        return "Fan speed: " + speedName +
                "\nFan on: " + on +
                "\nFan radius: " + radius +
                "\nFan color: " + color;
        }
    }

