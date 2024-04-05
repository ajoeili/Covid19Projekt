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
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "COVID19 DATA" +
                "\nRegion: " + region +
                "\nAldersgruppe: " + aldersgruppe +
                "\nBekræftede tilfælde i alt: " + iAlt +
                "\nDødsfald: " + dødsfald +
                "\nIndlagte på intensiv afdeling: " + indlagteIntensiv +
                "\nIndlagte: " + indlagte +
                "\nDato: " + dato
                + "\n"
                ;
    }
}
