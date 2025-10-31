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
            int[] maxColumna = new int[columnas];
            int total = 0;

            // 1. PEDIR NÚMEROS AL USUARIO

            System.out.println("Introduce 20 números enteros (4 filas × 5 columnas):");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.printf("Número [%d][%d]: ", i, j);
                    numeros[i][j] = sc.nextInt();
                }
            }


            // 2. CALCULAR SUMAS Y MÁXIMOS

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    int num = numeros[i][j];
                    sumaFila[i] += num;     // Suma de cada fila
                    total += num;           // Suma total

                    // Calcular máximo por columna
                    if (i == 0 || num > maxColumna[j]) {
                        maxColumna[j] = num;
                    }
                }
            }


            // 3. MOSTRAR TABLA FORMATEADA

            System.out.println();
            System.out.println("================================================================");
            System.out.println("                           TABLA");
            System.out.println("================================================================");

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.printf("%8d", numeros[i][j]);
                }
                System.out.printf(" |  Σ fila %d = %6d\n", i, sumaFila[i]);
            }

            System.out.println("----------------------------------------------------------------");

            // Mostrar máximos de columnas
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%8d", maxColumna[j]);
            }
            System.out.printf(" |  TOTAL = %6d\n", total);

            System.out.println("================================================================");

            sc.close();
        }
    }

