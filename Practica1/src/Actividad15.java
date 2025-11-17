import java.util.Scanner;
public class Actividad15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número para sacar su tabla de multiplicar: ");
        int numero = s.nextInt();
        System.out.println("Tabla de multpicar del " + numero + ": ");
        for (int i=1 ; i<= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
