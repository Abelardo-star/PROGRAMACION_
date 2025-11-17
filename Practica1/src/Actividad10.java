import java.util.Scanner;
public class Actividad10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número del día de la semana ");
        int dia = s.nextInt();
        String nombreDelDia;
        switch (dia) {
            case 1 -> nombreDelDia = "lunes";
            case 2 -> nombreDelDia = "martes";
            case 3 -> nombreDelDia = "miércoles";
            case 4 -> nombreDelDia = "jueves";
            case 5 -> nombreDelDia = "viernes";
            case 6 -> nombreDelDia = "sábado";
            case 7 -> nombreDelDia = "domingo";
            default -> nombreDelDia = "no existe dia";

        }
        System.out.println("Día de la semana " + dia + ": " + nombreDelDia);
    }
}
