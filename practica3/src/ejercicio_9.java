import java.util.Scanner;

public class ejercicio_9 {
    //Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un caballo
    //Que se encuentra en esa posición. Como se indica en la figura, el caballo se mueve siempre en forma de L.
    //El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
    //Ejemplo:
    //Introduzca la posición del caballo: d5
    //El caballo puede moverse a las siguientes posiciones: h1 a2 g2 b3 e3 c4 e4 c6 e6 b7 f7 a8 g8

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la posición del caballo (ej. d5): ");
        String posicion = sc.next(); // lee una sola palabra (sin espacios)

        // Obtener columna (letra) y fila (número) sin usar charAt ni toLowerCase
        String letra = posicion.substring(0, 1);
        String numero = posicion.substring(1, 2);

        // Convertir letra a minúscula manualmente
        if (letra.equals("A")) letra = "a";
        else if (letra.equals("B")) letra = "b";
        else if (letra.equals("C")) letra = "c";
        else if (letra.equals("D")) letra = "d";
        else if (letra.equals("E")) letra = "e";
        else if (letra.equals("F")) letra = "f";
        else if (letra.equals("G")) letra = "g";
        else if (letra.equals("H")) letra = "h";

        // Convertir número a entero
        int fila = Integer.parseInt(numero);

        // Convertir columna a índice (0–7)
        int col = letra.charAt(0) - 'a';
        int linea = 8 - fila;

        // Posibles movimientos del caballo
        int[][] movimientos = {
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2},
                {1, -2}, {1, 2},
                {2, -1}, {2, 1}
        };

        boolean[][] tablero = new boolean[8][8];

        // Marcar movimientos válidos
        for (int[] mov : movimientos) {
            int Filanueva = linea + mov[0];
            int nuevaCol = col + mov[1];
            if (Filanueva >= 0 && Filanueva < 8 && nuevaCol >= 0 && nuevaCol < 8) {
                tablero[Filanueva][nuevaCol] = true;
            }
        }

        // Mostrar tablero
        System.out.println("\nTablero:");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (i == linea && j == col)
                    System.out.print(" ♞ ");
                else if (tablero[i][j])
                    System.out.print(" ■ ");
                else
                    System.out.print(" □ ");
            }
            System.out.println();
        }

        System.out.println("   a  b  c  d  e  f  g  h");

        // Mostrar lista de movimientos
        System.out.print("\nEl caballo puede moverse a las siguientes posiciones: ");
        for (int[] mov : movimientos) {
            int Filanueva = linea + mov[0];
            int nuevaCol = col + mov[1];
            if (Filanueva >= 0 && Filanueva < 8 && nuevaCol >= 0 && nuevaCol < 8) {
                char nuevaColumna = (char) ('a' + nuevaCol);
                int nuevaFila = 8 - Filanueva;
                System.out.print(nuevaColumna + "" + nuevaFila + " ");
            }
        }
        System.out.println();
    }
}

