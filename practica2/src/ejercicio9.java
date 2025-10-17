import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números enteros por teclado
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Inicializar máximo y mínimo con el primer elemento
        int max = numeros[0];
        int posMax = 0;
        int min = numeros[0];
        int posMin = 0;

        // Recorrer el array para encontrar máximo y mínimo
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
                posMax = i;
            }
            if (numeros[i] < min) {
                min = numeros[i];
                posMin = i;
            }
        }

        // Mostrar resultados
        System.out.println("Valor máximo: " + max + " en la posición " + posMax);
        System.out.println("Valor mínimo: " + min + " en la posición " + posMin);
    }
}
