import java.util.Scanner;
public class Actividad6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce dos números para calcular su multiplicación,suma, resta y división " );
        System.out.print("x: " );
        int x = s.nextInt();
        System.out.print("y: " );
        int y = s.nextInt();
        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = (double )x / (double)y;
        System.out.println("El resultado de la suma de los números introducidos es: " + suma);
        System.out.println("El resultado de la resta de los números introducidos es: " + resta);
        System.out.println("El resultado de la multiplicación de los números introducidos es: " + multiplicacion);
        System.out.println("El resultado de la división de los números introducidos es: " + division);
    }

}
