import java.util.Scanner;
public class grupo60_clase15_julio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] datos = sc.nextLine().split(" ");
        double[] datos_numericos = new double[datos.length];
        for(int i = 0;i<datos.length;i++){
            datos_numericos[i] = Double.parseDouble(datos[i]);
        }
    }
}