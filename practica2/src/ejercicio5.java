import java.util.Scanner;

public class ejercicio5 {
    //Crea un array de números donde le indicamos por teclado el tamaño del array,
    //rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el
    //valor de cada posición y la suma de todos los valores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();

        int[] numeros = new int[tamaño];
        int suma = 0;

        // Rellenar el array con números aleatorios entre 0 y 9
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10); // genera números del 0 al 9
            suma += numeros[i];
        }

        // Mostrar el contenido del array
        System.out.println("Valores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + " -> Valor: " + numeros[i]);
        }

        // Mostrar la suma total
        System.out.println("La suma de todos los valores es: " + suma);

    }
}

