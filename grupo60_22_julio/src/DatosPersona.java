public class DatosPersona {
    private String nombre;
    private double edad;
    private String lugar_nacimiento;
    
    public DatosPersona(String nombre, double edad, String lugar_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }
    
}
