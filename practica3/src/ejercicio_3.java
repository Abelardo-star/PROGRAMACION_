import java.util.Random;

public class ejercicio_3 {
    //Modifica el programa anterior de tal forma que
    // los números que se introducen en el array se generen de forma aleatoria (valores entre 1 y 1999).
    public static void main(String[] args) {
        Random rand = new Random();

        int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];
        int[] sumaFila = new int[filas];
        int[] maxColumna = new int[columnas];
        int total = 0;


        // 1. GENERAR NÚMEROS ALEATORIOS

        System.out.println("Generando números aleatorios entre 1 y 1999...\n");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = rand.nextInt(1999) + 1; // Genera entre 1 y 1999
            }
        }


        // 2. CALCULAR SUMAS Y MÁXIMOS

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num = numeros[i][j];
                sumaFila[i] += num;      // Suma de la fila
                total += num;            // Suma total
                if (i == 0 || num > maxColumna[j]) {
                    maxColumna[j] = num; // Máximo de la columna
                }
            }
        }


        // 3. MOSTRAR TABLA FORMATEADA

        System.out.println("==========================================================");
        System.out.println("                        TABLA");
        System.out.println("==========================================================");

        // Mostrar los números y sumas de filas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%8d", numeros[i][j]); // cada número ocupa 8 espacios
            }
            System.out.printf(" |  Σ fila %d = %6d\n", i, sumaFila[i]);
        }

        // Línea separadora inferior
        System.out.println("----------------------------------------------------------");

        // Mostrar los mayores de cada columna y el total
        for (int j = 0; j < columnas; j++) {
            System.out.printf("Σ col %-2d =%6d ", j, maxColumna[j]);
        }
        System.out.printf("| TOTAL = %6d\n", total);

        System.out.println("==========================================================");
    }
}

