// Roxanne Buenaventura
// CSD 402
// October 4, 2026
// This is the InternationalDivision class, which extends the Division class. It adds specific attributes for international divisions, such as country and language, and implements the display method to show all relevant information.
public class InternationalDivision extends Division {
    // Stores the country and language of the international division
    private String country;
    private String language;
    // Initializes the international division with a name, account number, country, and language
    public InternationalDivision(String divisionName, int accountNumber,
                                String country, String language) {
        // Calls the constructor of the superclass (Division) to initialize common attributes
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    // Displays the details of the international division, including name, account number, country, and language
    @Override
    public void display() {
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
