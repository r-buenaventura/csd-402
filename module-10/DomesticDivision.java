// Roxanne Buenaventura
// CSD 402
// October 4, 2026
// This is the DomesticDivision class, which extends the Division class. It adds a specific attribute for domestic divisions, such as state, and implements the display method to show all relevant information.
public class DomesticDivision extends Division {
    // Stores the state of the domestic division
    private String state;
    // Initializes the domestic division with a name, account number, and state
    public DomesticDivision(String divisionName, int accountNumber, String state) {
    // Calls the constructor of the superclass (Division) to initialize common attributes
    super(divisionName, accountNumber);
    this.state = state;
    }
    // Displays the details of the domestic division, including name, account number, and state
    @Override
    public void display() {
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
    }
}
