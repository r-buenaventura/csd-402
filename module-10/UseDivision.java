// Roxanne Buenaventura
// CSD 402
// October 4, 2026
// This is the UseDivision class, which demonstrates the use of the InternationalDivision and DomesticDivision classes. It creates instances of both types of divisions and calls their display methods to show their details.
public class UseDivision {
    // The main method serves as the entry point of the program, where instances of InternationalDivision and DomesticDivision are created and their details are displayed.
    public static void main(String[] args) {
        // Creates instances of InternationalDivision with specific names, account numbers, countries, and languages
    InternationalDivision international1 =
            new InternationalDivision("Japan Division", 1001, "Japan", "Japanese");

    InternationalDivision international2 =
            new InternationalDivision("France Division", 1002, "France", "French");

    DomesticDivision domestic1 =
            new DomesticDivision("Washington Division", 2001, "Washington");

    DomesticDivision domestic2 =
            new DomesticDivision("Oregon Division", 2002, "Oregon");
// Calls the display method on each division instance to print their details to the console
    international1.display();
    System.out.println();

    international2.display();
    System.out.println();

    domestic1.display();
    System.out.println();

    domestic2.display();

    }
}
