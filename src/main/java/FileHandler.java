import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Covid19Data> loadCovidData() {
        ArrayList<Covid19Data> covid19Data = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("CovidData.csv"), StandardCharsets.ISO_8859_1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    (attributes[0]), // region
                    (attributes[1]), // aldersgruppe
                    (Integer.parseInt(attributes[2])), // iAlt
                    (Integer.parseInt(attributes[3])), // dødsfald
                    (Integer.parseInt(attributes[4])), // indlagtIntensiv
                    (Integer.parseInt(attributes[5])), // inlagte
                    attributes[6] // dato
            );

            covid19Data.add(data);
            System.out.println(data.toString());
        }
        sc.close();
        System.out.println("Successfully loaded");
        return covid19Data;
    }

}
