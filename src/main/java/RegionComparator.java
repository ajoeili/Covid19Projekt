import java.util.Collection;
import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {


    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        int regionCompare = d1.getRegion().compareTo(d2.getRegion());

        int aldersCompare = d1.getAldersgruppe().compareTo(d2.getAldersgruppe());

        return (regionCompare == 0) ? aldersCompare : regionCompare;
    }

}
