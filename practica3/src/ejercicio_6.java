import java.util.ArrayList;
import java.util.Random;

public class ejercicio_6 {
    public static void main(String[] args) {

        int filas = 3;
        int columnas = 7;
        int[][] numeros = new int[filas][columnas];

        // Crear array con números del 20 al 40
        int[] lista = new int[21];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 20 + i;
        }

        // Mezclar manualmente (sin usar set/get)
        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            int posAleatoria = random.nextInt(lista.length);
            int aux = lista[i];
            lista[i] = lista[posAleatoria];
            lista[posAleatoria] = aux;
        }

        // Variables para máximo y mínimo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // Rellenar matriz sin repetir
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = lista[index];
                index++;

                // Buscar máximo y mínimo
                if (numeros[i][j] > max) {
                    max = numeros[i][j];
                    maxFila = i;
                    maxCol = j;
                }
                if (numeros[i][j] < min) {
                    min = numeros[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Calcular sumas
        int sumaTotal = 0;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        // ------- TABLA BONITA -------
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║   MATRIZ SIN REPETIDOS (20 - 40)   ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        // Encabezado columnas
        System.out.print("         ");
        for (int j = 0; j < columnas; j++) {
            System.out.printf(" C%-4d ", j);
        }
        System.out.println("| SumaFila");

        System.out.println("──────────────────────────────────────────────────────────────────");

        // Filas
        for (int i = 0; i < filas; i++) {
            System.out.printf("Fila %d ", i);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("| %4d ", numeros[i][j]);
            }
            System.out.printf("| %3d\n", sumaFilas[i]);
        }

        System.out.println("──────────────────────────────────────────────────────────────────");

        // Suma columnas
        System.out.print(" Suma  ");
        for (int j = 0; j < columnas; j++) {
            System.out.printf("| %4d ", sumaColumnas[j]);
        }
        System.out.printf("| %3d TOTAL \n", sumaTotal);

        System.out.println("\nMáximo: " + max + " en [" + maxFila + "][" + maxCol + "]");
        System.out.println("Mínimo: " + min + " en [" + minFila + "][" + minCol + "]");
    }
}