public class ejercicio_1 {
    //Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y
    //asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del
    //array dispuestos en forma de tabla como se muestra en la figura.

    public static void main (String[] args) {
        double[][] doub = {
                {0.0, 30.0 , 2.0 , 0.0 , 0.0 , 5.0},   // Fila 0
                {75.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0}, // Fila 1
                {0.0 , 0.0 , -2.0 , 9.0 , 0.0 , 11.0} // Fila 2
        };
        // Encabezado
        System.out.printf("%-10s", "Array num");
        for (int j = 0; j < 6; j++) {
            System.out.printf("%12s", "Columna " + j);
        }
        System.out.println();

        // Filas
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("%-10s", "Fila " + i);
            for (int j = 0; j < doub[i].length; j++) {
                System.out.printf("%12.2f", doub[i][j]); // 12 espacios de ancho, 2 decimales
            }
            System.out.println();
        }
    }
}




