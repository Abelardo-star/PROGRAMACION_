import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    //    • Cree una lista de Strings (ArrayList<String>).
    //    • Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
    //    • Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en qué posición se encuentra si existe.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        while (true) {
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }

        System.out.print("Introduce un nombre para buscar: ");
        String nombreBuscado = sc.nextLine();

        // Buscar posicion en el indice
        int posicion = -1;
        int indice = 0;

        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(nombreBuscado)) {
                posicion = indice;
                break;
            }
            indice++;
        }

        if (posicion != -1) {
            System.out.println("El nombre '" + nombreBuscado + "' está en la lista, en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' no está en la lista.");
        }
    }
}
