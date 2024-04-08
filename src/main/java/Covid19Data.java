public class Covid19Data {

    private String region;
    private String aldersgruppe;
    private int iAlt;
    private int dødsfald;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int iAlt, int dødsfald, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.iAlt = iAlt;
        this.dødsfald = dødsfald;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Region: " + region +
                "\nAldersgruppe: " + aldersgruppe +
                "\nBekræftede tilfælde i alt: " + iAlt +
                "\nDødsfald: " + dødsfald +
                "\nIndlagte på intensiv afdeling: " + indlagteIntensiv +
                "\nIndlagte: " + indlagte +
                "\nDato: " + dato
                + "\n"
                ;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getiAlt() {
        return iAlt;
    }

    public int getDødsfald() {
        return dødsfald;
    }

    public int getIndlagteIntensiv() {
        return indlagteIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }
}
