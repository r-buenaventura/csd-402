// Roxanne Buenaventura
// CSD 402
// October 4, 2026
// This is the Division class, which serves as a base class for different divisions in a company. It contains common attributes and an abstract method that must be implemented by subclasses.
public abstract class Division {
    // Stores the name and account number of the division
    protected String divisionName;
    protected int accountNumber;

    // Initializes the division with a name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Requires subclasses to implement their own display method to show division details
    public abstract void display();
}