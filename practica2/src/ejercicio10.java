import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Sofia", "Pedro"}; //Lista de los nombres
        double[] notas = {9.5, 8.5, 7.5}; // Lista de las notas que corresponden a cada uno

        Scanner scanner = new Scanner(System.in);
         System.out.println(" Introduce el nombre del estudiante: ");
         String nombreBuscado = scanner.nextLine(); //Leer el nombre del estudiante escrito por teclado

         boolean encontrado = false;

        // Buscar en el array de nombres
         for(int i = 0; i < nombres.length; i++){
             if(nombres[i].equalsIgnoreCase(nombreBuscado)){
                 System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                 encontrado = true;
                 break; // Salir del bucle si se encuentra
             }
         }

         if(!encontrado){
             System.out.println("Estudiante no encontado.");
         }
    }

}
