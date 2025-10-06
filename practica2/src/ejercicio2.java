public class ejercicio2 {
    //Muestra por pantalla todos los elementos de un array de números enteros separados por un espacio.

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4,5,6,7,8,9,10};

        // Mostrar todos los elementos separados por un espacio
        System.out.println("Elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");

        }
        // Salto de línea al final
        System.out.println();
    }


}
