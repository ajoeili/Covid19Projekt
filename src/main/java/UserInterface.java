import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    String userInput = "";
    FileHandler fileHandler = new FileHandler();

    public void sortData() {
        ArrayList<Covid19Data> covid19Data = fileHandler.loadCovidData();

        System.out.println("Her kan du sortere data.");
        System.out.println("Indtast 'Region' for at sortere efter region.");
        System.out.println("Indtast 'Alder' for at sortere efter aldersgruppe.\n");

        userInput = sc.next();

        if (userInput.equalsIgnoreCase("region")) {
            covid19Data.sort(new RegionComparator());
        } else if (userInput.equalsIgnoreCase("alder")) {
            covid19Data.sort(new AldersGruppeComparator());
        } else {
            System.out.println("Det indtastede genkendes ikke.");
        }

        System.out.println(covid19Data);
    }

}
