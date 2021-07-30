import java.util.Random;
public class grupo60_clase_30_julio{
    public static void main(String[] args){
        Random random = new Random();
        int n = 5;
        int m = 5;
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
        subrutina1(matrix, n, m);
    }

    public static void subrutina1(int[][] M, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }    
    }

    public static String funcion1(int n){
        String respuesta = null;
        if(n>10){
            respuesta = "el numero es mayor a 10";
            return respuesta;
        }else{
            respuesta = "el numero es igual o menor a 10";
            return respuesta;
        }
    }
}