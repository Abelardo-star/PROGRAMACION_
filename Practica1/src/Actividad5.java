import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cantidad de pesetas para pasarlo a euros: ");
        double pesetas =  s.nextDouble();
        double tasa_cambio = 166.386;
        double euros = (double)pesetas / (double)tasa_cambio;
        System.out.println(pesetas + " pesetas equivale a " + euros + " euros.");
    }

}
