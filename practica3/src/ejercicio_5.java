import java.util.Random;

public class ejercicio_5 {
    public static void main(String[] args) {

        // Declaramos las filas y columnas de la matriz
        int filas = 6;
        int columnas = 10;

        // Creamos la matriz de 6x10
        int[][] numeros = new int[filas][columnas];

        // Para generar números aleatorios
        Random rand = new Random();

        // Variables para guardar el máximo y el mínimo
        int max = Integer.MIN_VALUE; // pongo el valor mínimo posible para que el primer número ya sea mayor
        int min = Integer.MAX_VALUE; // pongo el valor máximo posible para que el primer número ya sea menor

        // Estas guardan la posición del max y del min
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // Rellenamos la matriz y buscamos el máximo y el mínimo a la vez
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Metemos números aleatorios entre 0 y 1000
                numeros[i][j] = rand.nextInt(1001);

                // Si encontramos un número mayor que max, lo actualizamos
                if (numeros[i][j] > max) {
                    max = numeros[i][j];
                    maxFila = i; // guardo la posición
                    maxCol = j;
                }

                // Si encontramos un número menor que min, lo actualizamos
                if (numeros[i][j] < min) {
                    min = numeros[i][j];
                    minFila = i; // guardo la posición
                    minCol = j;
                }
            }
        }

        // Mostramos la matriz en pantalla para verla bonita
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%5d ", numeros[i][j]); // con formato para que quede alineado
            }
            System.out.println(); // salto de línea al terminar una fila
        }

        // Variables para sumar filas y columnas
        int sumaTotal = 0;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        // Recorremos otra vez la matriz para hacer las sumas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += numeros[i][j]; // sumo la fila
                sumaColumnas[j] += numeros[i][j]; // sumo la columna
                sumaTotal += numeros[i][j]; // suma total
            }
        }

        // Mostrar resultados
        System.out.println("\n----------------------------------------");
        System.out.println("Valor máximo: " + max + " en posición [" + maxFila + "][" + maxCol + "]");
        System.out.println("Valor mínimo: " + min + " en posición [" + minFila + "][" + minCol + "]");
        System.out.println("Suma total de todos los valores: " + sumaTotal);

        // Mostrar suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }

        // Mostrar suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
    }
}



