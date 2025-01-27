public class Main {
    public static void main(String args[]){

        Instrument trompeta = new InstrumentVent("trompeta", 5.2);
        Instrument tambor = new InstrumentPercussio("tambor", 3.7);
        InstrumentCorda guitarra = new InstrumentCorda("guitarra", 2.1);

        System.out.println("Instruments:  ");
        System.out.println(trompeta.getNom() + ",  preu :" + trompeta.getPreu());
        System.out.println(tambor.getNom() + ",  preu :" + tambor.getPreu());
        System.out.println(guitarra.getNom() + ",  preu :" + guitarra.getPreu() + "\n");

        trompeta.tocar();
        tambor.tocar();
        guitarra.tocar();

        System.out.println("\n");

        InstrumentPercussio tambor2 = new InstrumentPercussio("bateria", 3.7);

        Instrument trompeta2 = new InstrumentVent("trompeta2", 5.2);
        InstrumentVent trombo = new InstrumentVent("trombo", 5.2);

        InstrumentCorda guitarra2 = new InstrumentCorda("guitarra2", 2.1);
        InstrumentCorda guitarra3 = new InstrumentCorda("guitarra3", 2.1);
        InstrumentCorda guitarra4 = new InstrumentCorda("baix", 2.1);

        System.out.println(InstrumentVent.getComptadorInstancies());
        System.out.println(InstrumentPercussio.getComptadorInstancies());
        System.out.println(InstrumentCorda.getComptadorInstancies()+ "\n");

        System.out.println(InstrumentVent.getCostTotal());
        System.out.println(InstrumentPercussio.getCostTotal());
        System.out.println(InstrumentCorda.getCostTotal());

    }
}
