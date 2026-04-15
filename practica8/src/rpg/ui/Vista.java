package rpg.ui;

import rpg.model.*;
import java.util.List;
import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        System.out.println("\n---  MENU RPG  ---");
        System.out.println("1. Crear Personaje");
        System.out.println("2. Viajar a Ciudad");
        System.out.println("3. Ir a la Tienda");
        System.out.println("4. Cobrar Impuestos");
        System.out.println("5. Estadisticas Gremio");
        System.out.println("0. Salir");
        System.out.print("Elige una opcion: ");

        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public void mostrarMensaje(String m) {
        System.out.println(m);
    }

    public String pedirNombre() {
        System.out.print("Introduce el nombre del heroe: ");
        return sc.nextLine();
    }

    public void mostrarListaRazas(List<Razas> razas) {
        System.out.println("\n--- RAZAS DISPONIBLES ---");
        for (Razas r : razas) {
            System.out.println("ID: " + r.getId() + " - " + r.getNombre());
        }
    }

    public int pedirIdRaza() {
        System.out.print("Elige el ID de la raza: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public void mostrarListaClases(List<ClasesRPG> clases) {
        System.out.println("\n--- CLASES DISPONIBLES ---");
        for (ClasesRPG c : clases) {
            System.out.println("ID: " + c.getIdClase() + " - " + c.getNombreClase());
        }
    }

    public int pedirIdClase() {
        System.out.print("Elige el ID de la clase: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public void mostrarListaPersonajesNivel(List<Personajes> lista) {
        System.out.println("\n--- LISTA DE HEROES Y NIVELES ---");
        for (Personajes p : lista) {
            System.out.println("ID: " + p.getId() + " | " + p.getNombre() + " | Nivel: " + p.getNivel());
        }
    }

    public void mostrarListaCiudades(List<Ciudades> ciudades) {
        System.out.println("\n--- MAPA DE CIUDADES ---");
        for (Ciudades c : ciudades) {
            System.out.println("ID: " + c.getId() + " - " + c.getNombre() + " (Nivel min: " + c.getNivelMinimoAcceso() + ")");
        }
    }

    public int pedirIdCiudadViaje(Personajes p) {
        System.out.println("Viajando con: " + p.getNombre());
        System.out.print("Introduce el ID de la ciudad destino: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public void mostrarListaPersonajesResumida(List<Personajes> lista) {
        System.out.println("\n--- ¿QUIÉN VA A COMPRAR? ---");
        for (Personajes p : lista) {
            System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Oro: " + p.getOro());
        }
    }

    public void mostrarListaItems(List<Items> lista) {
        System.out.println("\n--- OBJETOS EN VENTA ---");
        for (Items i : lista) {
            System.out.println("ID: " + i.getId() + " - " + i.getNombre() + " | Precio: " + i.getPrecioOro());
        }
    }

    public int pedirOpcionTienda() {
        System.out.print("Introduce el ID del objeto a comprar: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public int pedirConfirmacion() {
        System.out.print("¿Quieres seguir? (0 para SI, 1 para NO): ");
        int conf = sc.nextInt();
        sc.nextLine();
        return conf;
    }

    public int pedirIdPersonaje() {
        System.out.print("Introduce el ID del personaje seleccionado: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }
}