import java.util.Random;
import java.util.Scanner;

public class ejercicio_8 {
    //Realizar el juego de la “Búsqueda del tesoro” donde si te acercas al tesoro te va avisando
    //De que hay un tesoro cerca pero agregando que tenemos dos posibles tesoros en el juego y uno de ellos es un impostor
    public static int distancia2(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy; // Evita usar raíz cuadrada (más eficiente)
    }

    // Muestra el tablero actual por consola
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        final int TAM = 11; // Tamaño del tablero (11x11)

        // Crear e inicializar el tablero con '?'
        char[][] tablero = new char[TAM][TAM];
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                tablero[i][j] = '?';
            }
        }

        // Posición aleatoria del tesoro real
        int realX = rand.nextInt(TAM);
        int realY = rand.nextInt(TAM);

        // Posición aleatoria del tesoro impostor (diferente al real)
        int impostorX, impostorY;
        do {
            impostorX = rand.nextInt(TAM);
            impostorY = rand.nextInt(TAM);
        } while (impostorX == realX && impostorY == realY);

        System.out.println(" Bienvenido a la Búsqueda del Tesoro (con impostor)");
        System.out.println("Introduce coordenadas X Y entre 0 y 10.");

        boolean juegoTerminado = false; // Controla el bucle del juego
        int intentos = 0; // Cuenta los intentos del jugador

        // Bucle principal del juego
        while (!juegoTerminado) {
            mostrarTablero(tablero); // Mostrar tablero actual

            // Pedir coordenadas al jugador
            System.out.print("Tu jugada (x y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            intentos++;

            // Verificar que las coordenadas estén dentro del tablero
            if (x < 0 || x >= TAM || y < 0 || y >= TAM) {
                System.out.println("Coordenadas fuera del tablero. Intenta otra vez.");
                continue;
            }

            // Verificar si ya se intentó esa posición
            if (tablero[y][x] == 'X') {
                System.out.println("Ya intentaste esa posición. Prueba otra.");
                continue;
            }

            // Marcar la casilla como visitada
            tablero[y][x] = 'X';

            // Comprobar si el jugador encontró el tesoro real
            if (x == realX && y == realY) {
                System.out.println(" ¡Encontraste el TESORO REAL! ");
                System.out.println("Intentos realizados: " + intentos);
                juegoTerminado = true;

                // Comprobar si el jugador cayó en el impostor
            } else if (x == impostorX && y == impostorY) {
                System.out.println("¡Caíste en el TESORO IMPOSTOR! ");
                System.out.println("Perdiste en " + intentos + " intentos...");
                juegoTerminado = true;

                // En caso contrario, dar pistas sobre la distancia
            } else {
                // Calcular distancia al cuadrado a cada tesoro
                int distReal2 = distancia2(x, y, realX, realY);
                int distImp2 = distancia2(x, y, impostorX, impostorY);

                // Determinar pistas según la distancia
                String pistaReal, pistaImp;
                if (distReal2 < 4) pistaReal = "muy cerca";
                else if (distReal2 < 16) pistaReal = "cerca";
                else pistaReal = "lejos";

                if (distImp2 < 4) pistaImp = "muy cerca";
                else if (distImp2 < 16) pistaImp = "cerca";
                else pistaImp = "lejos";

                // Mostrar las pistas
                System.out.println("Pistas:");
                System.out.println(" - Un tesoro está " + pistaReal + "...");
                System.out.println(" - Otro está " + pistaImp + " (¡pero uno es impostor!)");
                System.out.println("Intento #" + intentos);
            }
        }

        // Al terminar el juego, revelar las posiciones de los tesoros
        tablero[realY][realX] = 'T'; // Tesoro real
        tablero[impostorY][impostorX] = 'I'; // Tesoro impostor

        System.out.println("Tablero final (T = Tesoro real, I = impostor):");
        mostrarTablero(tablero); // Mostrar tablero con los tesoros revelados
    }
}