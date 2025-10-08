import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Leer N hasta que sea positivo
        do {
            System.out.print("Ingrese el número de personas (entero positivo): ");
            N = scanner.nextInt();
        } while (N <= 0);

        double[] alturas = new double[N];

        // Leer las alturas
        System.out.println("Ingrese las alturas de las " + N + " personas:");
        double suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }

        // Calcular media
        double media = suma / N;

        // Contar superiores e inferiores
        int superiores = 0;
        int inferiores = 0;
        for (double altura : alturas) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }

        // Mostrar resultados
        System.out.println("Altura media: " + media);
        System.out.println("Número de personas con altura superior a la media: " + superiores);
        System.out.println("Número de personas con altura inferior a la media: " + inferiores);

    }
}
