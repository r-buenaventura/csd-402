public class UseDivision {
    
    public static void main(String[] args) {

    InternationalDivision international1 =
            new InternationalDivision("Japan Division", 1001, "Japan", "Japanese");

    InternationalDivision international2 =
            new InternationalDivision("France Division", 1002, "France", "French");

    DomesticDivision domestic1 =
            new DomesticDivision("Washington Division", 2001, "Washington");

    DomesticDivision domestic2 =
            new DomesticDivision("Oregon Division", 2002, "Oregon");

    international1.display();
    System.out.println();

    international2.display();
    System.out.println();

    domestic1.display();
    System.out.println();

    domestic2.display();

    }
}
