import java.util.Scanner;
public class grupo01_clase13_julio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String datos[] = sc.nextLine().split(" ");
        double datos_num[] = new double[n];
        double suma = 0;
        for(int i = 0;i<n;i++){
            datos_num[i] = Double.parseDouble(datos[i]);
            suma = suma +datos_num[i];
        }
        System.out.println(suma);
    }
}
