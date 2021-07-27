import java.util.Scanner;
public class principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DatosPersona[] datos = new DatosPersona[n];
        for(int i = 0;i<n;i++){
            String[] datos_persona = sc.nextLine().split(" ");
            //datos[i] = new DatosPersona(datos_persona[0], 
            //           Double.parseDouble(datos_persona[1]),datos_persona[2]);
            DatosPersona temp = new DatosPersona();
            temp.setNombre(datos_persona[0]);
            temp.setEdad(Double.parseDouble(datos_persona[1]));
            temp.setLugar_nacimiento(datos_persona[2]);
            datos[i] = temp;
        }

        for(int i = 0; i<n;i++){
            String texto = datos[i].getNombre() + " " + datos[i].getLugar_nacimiento();
            System.out.println(texto);
        }
    }
}
