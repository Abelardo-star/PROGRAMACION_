import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números enteros:");
        String result = "";
        for(int i=0; i<10; i++) {
            result = scanner.nextLine() + result;

        }
        System.out.println(" Los números al orden inverso seria: " + result );

    }
}
