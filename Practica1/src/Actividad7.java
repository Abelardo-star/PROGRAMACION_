import java.util.Scanner;
public class Actividad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double base =  s.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura =  s.nextDouble();
        double area = base * altura;
        System.out.print("El resultado del área del rectángulo sera: " + area);
    }

}

