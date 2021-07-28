import java.util.Scanner;
public class grupo60_clase_28_julio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //int n = sc.nextInt();
        //sc.nextLine();
        //String[] vector_texto = new String[n];
        //vector_texto = sc.nextLine().split(" ");
        //System.out.println(vector_texto.length);

        String[] vector_texto2 = sc.nextLine().split(" ");
        System.out.println(vector_texto2.length);
        double[] vector_numeros = new double[vector_texto2.length];
        for(int i = 0; i<n; i++){
            vector_numeros[i] = Double.parseDouble(vector_texto2[i]);
            if(vector_numeros[i] > 5){
                System.out.println("El numero es mayor a 5");
            }
        }
    }
}