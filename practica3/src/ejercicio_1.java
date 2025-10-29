public class ejercicio_1 {

    public static void main(String[] args) {

        //Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla.
        // Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.

        double[][] doub = {
                {0.0, 30.0, 2.0, 0.0, 0.0, 5.0},   // Fila 0
                {75.0, 0.0, 0.0, 0.0, 0.0, 0.0},   // Fila 1
                {0.0, 0.0, -2.0, 9.0, 0.0, 11.0}   // Fila 2
        };

        // auxiliar booleano para indicar qué posiciones están vacías
        //  true → celda vacía
        //  false → celda con número

        boolean[][] vacio = {
                {false, false, false, true, true, false}, // Fila 0
                {false, true, true, true, false, true},   // Fila 1
                {true, true, false, false, true, false}   // Fila 2
        };

        //Variable que define el ancho de cada columna para alinear bien la tabla

        int anchoCol = 15;

        //Línea superior de la tabla (decorativa)
        // repeat() repite el carácter "=" tantas veces como sea necesario

        System.out.println("=".repeat(10 + (anchoCol + 2) * (doub[0].length)));

        //Impresión del encabezado de columnas
        // %-10s → deja 10 caracteres alineado a la izquierda
        // %-" + anchoCol + "s → ajusta el ancho dinámicamente

        System.out.printf("%-10s", "Array num");
        for (int j = 0; j < doub[0].length; j++) {
            System.out.printf("| %-" + anchoCol + "s", "Columna " + j);
        }
        System.out.println("|");

        //Línea divisoria después del encabezado

        System.out.println("-".repeat(10 + (anchoCol + 2) * (doub[0].length)));

        //Recorremos las filas del array principal

        for (int i = 0; i < doub.length; i++) {

            // Imprimimos el nombre de la fila (por ejemplo, "Fila 0")
            System.out.printf("%-10s", "Fila " + i);

            //Recorremos cada columna dentro de la fila

            for (int j = 0; j < doub[i].length; j++) {

                // Imprimimos el separador vertical
                System.out.print("| ");

                // Si la posición debe estar vacía, imprimimos un espacio
                if (vacio[i][j]) {
                    System.out.printf("%-" + anchoCol + "s", " ");
                }
                // De lo contrario, imprimimos el valor numérico con dos decimales
                else {
                    System.out.printf("%-" + anchoCol + ".2f", doub[i][j]);
                }
            }

            // Cerramos la última columna con el separador y salto de línea
            System.out.println("|");
            System.out.println("-".repeat(10 + (anchoCol + 2) * (doub[0].length)));
        }
    }
}




