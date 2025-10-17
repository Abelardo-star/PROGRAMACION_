import java.util.Arrays;

public class ejercicio11 {

    public static void main(String[] args) {

        //  Declarar e inicializar el array original de tamaño 6
        int[] arrayOriginal = {1, 2, 3, 4, 5, 6};

        //  Crear un nuevo array con la misma longitud para almacenar el resultado
        int[] arrayInvertido = new int[arrayOriginal.length];

        //  Llenar el nuevo array con los valores del array original en orden inverso
        // Se usa un bucle que va de la última posición del array original a la primera
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Imprimir el array original y el invertido para verificar
        System.out.println("Array original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
    }
}

