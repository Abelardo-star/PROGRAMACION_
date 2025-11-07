import java.util.Random;
import java.util.Scanner;

public class ejercicio_8 {
    //Realizar el juego de la “Búsqueda del tesoro” donde si te acercas al tesoro te va avisando
    //De que hay un tesoro cerca pero agregando que tenemos dos posibles tesoros en el juego y uno de ellos es un impostor
    public static int distancia2(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy;
    }

    // Muestra el tablero
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (char[] chars : tablero) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        final int TAM = 11;

        // Crear tablero
        char[][] tablero = new char[TAM][TAM];
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                tablero[i][j] = '?';
            }
        }

        // Posiciones de tesoros
        int realX = rand.nextInt(TAM);
        int realY = rand.nextInt(TAM);

        int impostorX, impostorY;
        do {
            impostorX = rand.nextInt(TAM);
            impostorY = rand.nextInt(TAM);
        } while (impostorX == realX && impostorY == realY);

        System.out.println(" Bienvenido a la Búsqueda del Tesoro (con impostor)");
        System.out.println("Introduce coordenadas X Y entre 0 y 10.");

        boolean juegoTerminado = false;
        int intentos = 0;

        // Bucle controlado
        while (!juegoTerminado) {
            mostrarTablero(tablero);

            System.out.print("Tu jugada (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            intentos++;

            if (x < 0 || x >= TAM || y < 0 || y >= TAM) {
                System.out.println("Coordenadas fuera del tablero. Intenta otra vez.");
                continue;
            }

            if (tablero[y][x] == 'X') {
                System.out.println("Ya intentaste esa posición. Prueba otra.");
                continue;
            }

            tablero[y][x] = 'X';

            if (x == realX && y == realY) {
                System.out.println(" ¡Encontraste el TESORO REAL! ");
                System.out.println("Intentos realizados: " + intentos);
                juegoTerminado = true;
            } else if (x == impostorX && y == impostorY) {
                System.out.println("¡Caíste en el TESORO IMPOSTOR! ");
                System.out.println("Perdiste en " + intentos + " intentos...");
                juegoTerminado = true;
            } else {
                int distReal2 = distancia2(x, y, realX, realY);
                int distImp2 = distancia2(x, y, impostorX, impostorY);

                String pistaReal, pistaImp;
                if (distReal2 < 4) pistaReal = "muy cerca";
                else if (distReal2 < 16) pistaReal = "cerca";
                else pistaReal = "lejos";

                if (distImp2 < 4) pistaImp = "muy cerca";
                else if (distImp2 < 16) pistaImp = "cerca";
                else pistaImp = "lejos";

                System.out.println("Pistas:");
                System.out.println(" - Un tesoro está " + pistaReal + "...");
                System.out.println(" - Otro está " + pistaImp + " (¡pero uno es impostor!)");
                System.out.println("Intento #" + intentos);
            }
        }

        // Revelar posiciones al final
        tablero[realY][realX] = 'T';
        tablero[impostorY][impostorX] = 'I';

        System.out.println("Tablero final (T = Tesoro real, I = impostor):");
        mostrarTablero(tablero);
    }
}