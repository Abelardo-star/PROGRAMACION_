import java.util.Scanner;
public class Actividad8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un día de la semana(lectivo): ");
        String dia = s.nextLine();

        if (dia.equals("Lunes")) {
            System.out.println(" Primera hora Digitalización");
        } else if (dia.equals("Martes")) {
            System.out.println(" Primera hora Sistemas Informáticos");
        } else if (dia.equals("Miércoles")) {
            System.out.println(" Primera hora Sistemas Informáticos");
        } else if (dia.equals("Jueves")) {
            System.out.println("IPE");
        } else if (dia.equals("Viernes")) {
            System.out.println(" Primera hora Programación");
        }

    }
}


