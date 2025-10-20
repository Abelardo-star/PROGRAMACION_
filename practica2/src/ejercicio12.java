import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        // Array con las letras del DNI en orden
        char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número del DNI
        System.out.print("Introduce el número del DNI (solo el número, sin letra): ");
        int numero = scanner.nextInt();

        // Calcular el resto de dividir entre 23
        int resto = numero % 23;

        // Obtener la letra correspondiente
        char letra = letrasDni[resto];

        // Mostrar el resultado
        System.out.println("La letra del DNI es: " + letra);
    }
}
