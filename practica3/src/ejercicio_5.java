import java.util.Random;

public class ejercicio_5 {
    //Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá:
    //    • dar la posición del número máximo y mínimo
    //    • la suma total de todas las filas y columnas
    //    • la suma de todas las columnas
    //    • la suma de todas las filas.
    public static void main(String[] args) {

        int filas = 6;
        int columnas = 10;

        int[][] numeros = new int[filas][columnas];
        Random rand = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // Rellenamos la matriz con números aleatorios y buscamos min y max
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                numeros[i][j] = rand.nextInt(1001); // número aleatorio entre 0-1000

                // comprobar máximo
                if (numeros[i][j] > max) {
                    max = numeros[i][j];
                    maxFila = i;
                    maxCol = j;
                }

                // comprobar mínimo
                if (numeros[i][j] < min) {
                    min = numeros[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Arrays para sumar filas y columnas
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        int sumaTotal = 0;

        // Calcular sumas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        // ---------------- TABLA ----------------

        System.out.println("TABLA DE VALORES (con suma de filas):");

        // Imprimir cabecera de columnas
        System.out.print("  ");
        for (int j = 0; j < columnas; j++) {
            System.out.printf("             C%-7d ", j);
        }
        System.out.println("|SumaFila");

        // Imprimir matriz con suma de cada fila
        for (int i = 0; i < filas; i++) {
            System.out.printf("Fila %-2d", i);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%20d ", numeros[i][j]);
            }
            System.out.printf("| %d\n", sumaFilas[i]);
        }

        // línea separadora
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // Mostrar suma de columnas
        System.out.print("SumaCol ");
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%20d ", sumaColumnas[j]);
        }
        System.out.printf("| Total = %d\n", sumaTotal);

        // Resultados extra
        System.out.println("\nMáximo: " + max + " en posición [" + maxFila + "][" + maxCol + "]");
        System.out.println("Mínimo: " + min + " en posición [" + minFila + "][" + minCol + "]");
    }
}




