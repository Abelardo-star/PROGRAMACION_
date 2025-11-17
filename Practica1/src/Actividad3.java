import java.util.Scanner;
public class Actividad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cantidad de euros para pasarlo a pesetas: ");
        double euros =  s.nextDouble();
        double tasa_cambio = 166.386;
        double pesetas = euros * tasa_cambio;
        System.out.println(euros + " Euros equivale a " + pesetas + " pesetas.");

    }
}
