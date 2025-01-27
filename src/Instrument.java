abstract class Instrument implements ICosesQueSonen {
    private String nom;
    private Double preu;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    public Instrument(String nom, Double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public Instrument() {
    }

}
