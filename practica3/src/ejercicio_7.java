import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_7 {
    //Modifica el programa del Ejercicio 6 para que:
    //    1. Los números NO se repitan (como en el ejercicio anterior).
    //    2. Los números estén comprendidos en un rango dinámico (el usuario introduce el valor mínimo y máximo).
    //    3. Al final, el programa muestre:
    //        ◦ La media aritmética de todos los números del array.
    //        ◦ La posición de todos los números primos que haya en el array.
    //        ◦ Una representación gráfica en consola de cada fila, donde cada número se represente con un número de * proporcional
    //        a su valor dentro del rango dado (por ejemplo, si el rango es 10-20 y aparece el 15, se mostrarán 5

    // Función para comprobar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int filas = 3;
        int columnas = 7;

        System.out.print("Introduce el valor mínimo del rango: ");
        int minRango = sc.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int maxRango = sc.nextInt();

        // Verificar que el rango tiene suficientes números
        int totalNecesario = filas * columnas;
        if ((maxRango - minRango + 1) < totalNecesario) {
            System.out.println("\nERROR: El rango NO tiene suficientes números únicos.");
            System.out.println("Se necesitan " + totalNecesario + " valores distintos.");
            return;
        }

        int[][] matriz = new int[filas][columnas];

        // Crear lista con el rango de números sin repetir
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = minRango; i <= maxRango; i++) {
            lista.add(i);
        }

        // Mezclar manualmente (como barajar cartas)
        Random random = new Random();
        for (int i = 0; i < lista.size(); i++) {
            int posAleatoria = random.nextInt(lista.size());
            int aux = lista.get(i);
            lista.set(i, lista.get(posAleatoria));
            lista.set(posAleatoria, aux);
        }

        int index = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // Rellenar matriz sin repetir
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = lista.get(index++);
                if (matriz[i][j] > max) { max = matriz[i][j]; maxFila = i; maxCol = j; }
                if (matriz[i][j] < min) { min = matriz[i][j]; minFila = i; minCol = j; }
            }
        }

        // Sumas y media
        int sumaTotal = 0;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
        }

        double media = (double) sumaTotal / (filas * columnas);

        // -------- TABLA --------
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.println("║        MATRIZ SIN REPETIDOS (Rango dinámico)     ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        System.out.print("        ");
        for (int j = 0; j < columnas; j++) System.out.printf(" C%-3d ", j);
        System.out.println("| SumaFila");
        System.out.println("──────────────────────────────────────────────────────────");

        for (int i = 0; i < filas; i++) {
            System.out.printf("Fila %d ", i);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("| %3d ", matriz[i][j]);
            }
            System.out.printf("| %3d\n", sumaFilas[i]);
        }

        System.out.println("──────────────────────────────────────────────────────────");

        System.out.print("Suma   ");
        for (int j = 0; j < columnas; j++) System.out.printf("| %3d ", sumaColumnas[j]);
        System.out.printf("| %3d TOTAL\n", sumaTotal);

        System.out.printf("\nMedia aritmética = %.2f\n", media);
        System.out.println("Máximo: " + max + " en [" + maxFila + "][" + maxCol + "]");
        System.out.println("Mínimo: " + min + " en [" + minFila + "][" + minCol + "]");

        // -------- PRIMOS --------
        System.out.println("\nNúmeros primos y sus posiciones:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.println("Primo: " + matriz[i][j] + " en [" + i + "][" + j + "]");
                }
            }
        }

        // -------- GRÁFICO DE ESTRELLAS --------
        System.out.println("\nRepresentación gráfica (*):");
        for (int i = 0; i < filas; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < columnas; j++) {
                int estrellas = matriz[i][j] - minRango;
                for (int k = 0; k < estrellas; k++) System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}