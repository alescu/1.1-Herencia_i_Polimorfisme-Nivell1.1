public class InstrumentCorda extends Instrument {

    private static int comptadorInstancies = 0;
    private static Double costTotal = 0.0;

    public void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

    public InstrumentCorda(String nom, Double preu) {
        this.setNom(nom);
        this.setPreu(preu);
        comptadorInstancies++;
        costTotal=costTotal+preu;
    }

    public InstrumentCorda(){
        comptadorInstancies++;
    }

    public static String getComptadorInstancies() {
        return "Nª d'instruments de corda: " + comptadorInstancies;
    }

    public static String getCostTotal() {
        return "CostTotal dels instrument de corda: " + costTotal;
    }

}
