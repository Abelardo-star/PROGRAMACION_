import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    //    • Cree una lista de enteros (ArrayList<Integer>).
    //    • Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
    //    • Muestre por pantalla todos los números de la lista y la suma total de los mismos.

    public static void main(String[] args) {
        // Crear una lista de enteros
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir números hasta que se introduzca uno negativo
        System.out.println("Introduce números enteros. Para terminar, introduce un número negativo:");
        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Salir del bucle si es negativo
            }

            listaNumeros.add(numero); // Añadir el número a la lista si es positivo o cero
        }

        // Mostrar todos los números de la lista
        System.out.println("Números introducidos:");
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        // Calcular y mostrar la suma total
        int suma = 0;
        for (int num : listaNumeros) {
            suma += num;
        }
        System.out.println("Suma total: " + suma);

    }
}

