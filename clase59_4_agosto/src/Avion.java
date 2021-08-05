public class Avion extends Hangar{
    private String Tipo_avion;
    private int Num_tur;

    public Avion(String Tipo_avion, int Num_tur, double Id, String donde){
        super(Id, donde);
        this.Tipo_avion = Tipo_avion;
        this.Num_tur = Num_tur;
    }

    public String getTipo_avion() {
        return Tipo_avion;
    }

    public void setTipo_avion(String tipo_avion) {
        Tipo_avion = tipo_avion;
    }

    public int getNum_tur() {
        return Num_tur;
    }

    public void setNum_tur(int num_tur) {
        Num_tur = num_tur;
    }

    

}
