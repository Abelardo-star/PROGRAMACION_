import java.util.Scanner;

public class ejercicio3 {

    //Crea un array que contenga 5 números. Realiza un programa que te muestre por pantalla SOLO el más pequeño de ellos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        // Pedir los 5 números al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        // Suponemos que el primero es el más pequeño
        int menor = numeros[0];
        //recorremos el array para encontrar al menor
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i]< menor){
                menor = numeros[i];
            }

        }
        // Mostrar el número más pequeño
        System.out.println("El número más pequeño es: " + menor);
    }
}




