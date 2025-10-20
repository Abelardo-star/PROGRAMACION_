import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    //    • Cree una lista de Strings (ArrayList<String>).
    //    • Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
    //    • Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en qué posición se encuentra si existe.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        // Pedir nombres al usuario
        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        while (true) {
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }

        // Pedir nombre a buscar
        System.out.print("Introduce un nombre para buscar: ");
        String nombreBuscado = sc.nextLine();

        // Comprobar si está en la lista
        if (nombres.contains(nombreBuscado)) {
            int posicion = nombres.indexOf(nombreBuscado) + 1; //sumamos 1
            System.out.println("El nombre '" + nombreBuscado + "' está en la lista, en la posición " + posicion + ".");
        } else {
            System.out.println("El nombre '" + nombreBuscado + "' no está en la lista.");
        }

    }
}

