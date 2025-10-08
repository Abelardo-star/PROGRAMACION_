import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números enteros por teclado
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Variables para positivos y negativos
        int sumaPositivos = 0;
        int contadorPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;

        // Recorrer el array y sumar/contar
        for (int num : numeros) {
            if (num > 0) {
                sumaPositivos += num;
                contadorPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                contadorNegativos++;
            }
        }

        // Calcular y mostrar media de positivos
        if (contadorPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / contadorPositivos;
            System.out.println("Media de los valores positivos: " + mediaPositivos);
        } else {
            System.out.println("No hay valores positivos.");
        }

        // Calcular y mostrar media de negativos
        if (contadorNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / contadorNegativos;
            System.out.println("Media de los valores negativos: " + mediaNegativos);
        } else {
            System.out.println("No hay valores negativos.");
        }
    }
}