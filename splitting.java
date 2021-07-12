import java.util.Scanner;
import java.util.Arrays;

public class splitting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] data = sc.nextLine().split("-");
        int[] data_int = new int[data.length];
        for(int i = 0; i < data.length;i++){
            data_int[i] = Integer.parseInt(data[i]);
        }
        System.out.println(Arrays.toString(data_int));
    }
}