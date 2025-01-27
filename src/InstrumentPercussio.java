public class InstrumentPercussio extends Instrument {

    private static int comptadorInstancies = 0;
    private static Double costTotal = 0.0;

    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }

    public InstrumentPercussio(String nom, Double preu) {
        comptadorInstancies++;
        this.setNom(nom);
        this.setPreu(preu);
        comptadorInstancies++;
        costTotal=costTotal+preu;
    }

    public InstrumentPercussio() {
        comptadorInstancies++;
    }

    public static String getComptadorInstancies() {
        return "Nª d'instruments de percussió: " + comptadorInstancies;
    }

    public static String getCostTotal() {
        return "CostTotal dels instrument de percussió: " + costTotal;
    }

}