import java.util.Scanner;

public class ejercicio6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10];

            // Leer 10 números enteros por teclado
            System.out.println("Ingrese 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                numeros[i] = scanner.nextInt();
            }

            // Contadores
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            // Recorrer el array y contar
            for (int num : numeros) {
                if (num > 0) {
                    positivos++;
                } else if (num < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }

            // Mostrar resultados
            System.out.println("Números positivos: " + positivos);
            System.out.println("Números negativos: " + negativos);
            System.out.println("Números ceros: " + ceros);
        }
}




