import java.util.Scanner;

public class grupo60_clase13_julio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        /*
        ##### LEER DATOS EN DISTINTAS LINEAS DE CODIGO
        */
        double datos_num[] = new double[n];
        double suma = 0;
        for(int i = 0;i<n;i++){
            datos_num[i] = Double.parseDouble(sc.nextLine());
            suma = suma + datos_num[i];
        }
        System.out.println(suma);
        // ["1","2","5",...,"num"]
        // [1,2,5,...,num]

        /*
        ##### LEER DATOS EN UNA SOLA LINEA DE CODIGO 
        ##### COMO VECTOR DE STRING Y HACER LA CONVERSION
        String datos[] = sc.nextLine().split(" ");
        double datos_num[] = new double[n];
        double suma = 0;
        for(int i = 0; i<n;i++){
            datos_num[i] = Double.parseDouble(datos[i]);
            suma = suma + datos_num[i];
        }
        System.out.println(suma);
        */
    }
}
