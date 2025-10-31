import java.util.Random;

public class ejercicio_4 {
    //Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retraso,
    // dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.

    public static void main(String[] args) throws InterruptedException {
        int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];
        int[] mayores = new int[columnas];
        int sumaTotal = 0;

        Random rand = new Random();

        // Generar números aleatorios entre 1 y 1999
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = rand.nextInt(1999) + 1;
            }
        }


        System.out.println("Números generados (el ordenador está pensando...)\n");
        Thread.sleep(1000);
        System.out.println("========================================================================================================================================");
        System.out.println("                                                                  TABLA");
        System.out.println("========================================================================================================================================");

        // Mostrar tabla con sumas de filas
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%21d |", numeros[i][j]);
                sumaFila += numeros[i][j];

                // Guardar el mayor de cada columna
                if (i == 0 || numeros[i][j] > mayores[j]) {
                    mayores[j] = numeros[i][j];
                }
            }
            Thread.sleep(500);
            System.out.printf("  Σ fila %d = %6d|%n", i, sumaFila);
            sumaTotal += sumaFila;
        }

        // Línea divisoria
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        // Mostrar Σ columna alineado con cada columna
        for (int j = 0; j < columnas; j++) {
            Thread.sleep(300);
            System.out.printf("| Σ columna %-2d = %-6d|", j, mayores[j]);
        }

        Thread.sleep(800);
        System.out.printf(" TOTAL = %6d|%n", sumaTotal);

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
