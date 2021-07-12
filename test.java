import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int cantidad1, cantidad2, cantidad3, cantidad4;
        double promedio;
        System.out.println("Digite el sueldo de la persona 1");
        cantidad1 = leer.nextInt();
        System.out.println("Digite el sueldo de la persona 2");
        cantidad2 = leer.nextInt();
        System.out.println("Digite el sueldo de la persona 3");
        cantidad3 = leer.nextInt();
        System.out.println("Digite el sueldo de la persona 4");
        cantidad4 = leer.nextInt();
        promedio = (cantidad1+cantidad2+cantidad3+cantidad4)/4;
        System.out.println("El promedio es "+promedio);
    }
}