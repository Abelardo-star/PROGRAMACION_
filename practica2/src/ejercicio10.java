import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"Alice", "Bob", "Charlie"};
        double[] notas = {90.5, 85.0, 78.5};

        Scanner scanner = new Scanner(System.in);
         System.out.println(" Introduce el nombre del estudiante: ");
         String nombreBuscado = scanner.nextLine();

         boolean encontrado = false;

         for(int i = 0; i < nombres.length; i++){
             if(nombres[i].equalsIgnoreCase(nombreBuscado)){
                 System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                 encontrado = true;
                 break;
             }
         }

         if(!encontrado){
             System.out.println("Estudiante no encontado.");
         }
    }

}
