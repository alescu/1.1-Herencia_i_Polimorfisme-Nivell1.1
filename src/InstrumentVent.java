public class InstrumentVent extends Instrument {

    private static int comptadorInstancies = 0;
    private static Double costTotal = 0.0;

    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

    public InstrumentVent(String nom, Double preu) {
        this.setNom(nom);
        this.setPreu(preu);
        comptadorInstancies++;
        costTotal=costTotal+preu;
    }

    public InstrumentVent(){
        comptadorInstancies++;
    }

    public static String getComptadorInstancies() {
        return "Nª d'instruments de vent: " + comptadorInstancies;
    }
    public static String getCostTotal() {
        return "CostTotal dels instrument de vent: " + costTotal;
    }

}
