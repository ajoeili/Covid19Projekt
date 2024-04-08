import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {


    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        int aldersCompare = d1.getAldersgruppe().compareTo(d2.getAldersgruppe());

        int regionCompare = d1.getRegion().compareTo(d2.getRegion());

        return (aldersCompare == 0) ? regionCompare : aldersCompare;
    }
}
