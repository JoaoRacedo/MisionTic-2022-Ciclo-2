public class Principal {
    public static void main(String[] args) throws Exception {
        Hangar Ernesto = new Hangar(1,"Prueba");
        Avion phantom = new Avion("Guerra", 4, Ernesto.getId(), Ernesto.getDonde());
        Avion avioneta = new Avion("Comercial", 4, 2, "Ernesto");
    }
}
