public class grupo50_27_julio{

    public static void main(String[] args){
        //  == evalua la igualdad de las referencias
        System.out.println(new String("hola") == "hola");
        // .equals() evalua igualdad de valores
        System.out.println(new String("hola").equals("hola"));
        System.out.println("hola" == "hola");
        System.out.println(!true); // -> not(true) -> niega(verdadero) -> false
        // Todos los lenguajes de programacion hacen la pregunta de si es verdadero
        if(true){
            System.out.println("Entre");
        }
    }
}