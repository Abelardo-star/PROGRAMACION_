import java.util.Scanner;
public class ejercicio_2 {

    //Escribe un programa que solicite 20 números enteros. Estos números debemos de
    //introducirlo en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales
    //de filas y en las columnas el mayor número de la columna. La suma total debe aparecer en
    //la esquina inferior derecha.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];
        int[] sumaFila = new int[filas];
        int[] sumaColumna = new int[columnas];
        int total = 0;

        // Leer los 20 números
        System.out.println("Introduce 20 números enteros (4 filas x 5 columnas):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                numeros[i][j] = sc.nextInt();
                sumaFila[i] += numeros[i][j];
                sumaColumna[j] += numeros[i][j];
                total += numeros[i][j];
            }
        }

        System.out.println();
        System.out.println("================================ TABLA =================================");
        System.out.println();

        // Mostrar tabla alineada
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%10d", numeros[i][j]);
            }
            System.out.printf("   |   Σ fila %d = %d\n", i, sumaFila[i]);
        }

        // Línea divisoria
        System.out.println("-----------------------------------------------------------------------");

        // Mostrar sumas de columnas
        for (int j = 0; j < columnas; j++) {
            System.out.printf("Σ col %-2d = %-5d", j, sumaColumna[j]);
        }
        System.out.printf("  |  TOTAL = %d\n", total);

        System.out.println();
        System.out.println("========================================================================");
    }
}