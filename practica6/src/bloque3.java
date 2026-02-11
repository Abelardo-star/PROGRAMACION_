import java.util.*;

public class bloque3 {

    public static void main(String[] args) {

        //EJERCICIO 11
        // Crea un HashMap para los precios de los ítems
        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Espada", 100.0); // Agrega el precio de la Espada
        precios.put("Escudo", 120.0); // Agrega el precio del Escudo
        precios.put("Poción", 25.0); // Agrega el precio de la Poción
        precios.put("Armadura", 250.0); // Agrega el precio de la Armadura
        precios.put("Casco", 90.0); // Agrega el precio del Casco
        precios.put("Anillo", 300.0); // Agrega el precio del Anillo

        HashMap<String, ArrayList<String>> ciudades = new HashMap<>(); // Crea un HashMap de ciudades con sus ítems
        // Agrega Bornos con su lista de ítems disponibles
        ciudades.put("Bornos",new ArrayList<>(Arrays.asList("Espada", "Escudo", "Poción", "Armadura", "Casco", "Anillo")));


        System.out.println("EJERCICIO 11");
        HashMap<String, Double> preciosFinales = obtenerPreciosCiudad("Bornos", precios, ciudades);
        // Llama a la función que calcula los precios finales de la ciudad

        for (String item : preciosFinales.keySet()) { // Itera sobre los ítems de la ciudad
            System.out.println(item + " -> " + preciosFinales.get(item)); // Imprime el ítem y su precio final
        }

        //EJERCICIO 12
        System.out.println("\nEJERCICIO 12");
        // Crea un HashMap para las habilidades de cada clase
        HashMap<String, HashMap<String, Boolean>> habilidades = new HashMap<>();
        HashMap<String, Boolean> paladin = new HashMap<>(); // Crea un HashMap para las habilidades del Paladín
        paladin.put("Enfoque", true); // Asigna que Enfoque ya está desbloqueado
        paladin.put("Golpe Divino", false); // Golpe Divino inicialmente bloqueado
        habilidades.put("Paladín", paladin); // Agrega las habilidades del Paladín al árbol

        desbloquearGolpeDivino(habilidades, "Paladín");
        // Llama a la función que intenta desbloquear Golpe Divino

        //EJERCICIO 13
        System.out.println("\nEJERCICIO 13");
        HashMap<String, List<HashSet<String>>> raids = new HashMap<>();
        // Crea un HashMap para almacenar raids por mazmorra

        HashSet<String> r1 = new HashSet<>(Arrays.asList("Ana", "Luis", "Abe")); // Raid 1 con jugadores
        HashSet<String> r2 = new HashSet<>(Arrays.asList("Abe", "Carlos")); // Raid 2 con jugadores
        HashSet<String> r3 = new HashSet<>(Arrays.asList("Abe", "Ana")); // Raid 3 con jugadores

        raids.put("Mazmorra Oscura", new ArrayList<>(Arrays.asList(r1, r2, r3)));
        // Agrega la lista de raids a la Mazmorra Oscura

        mostrarEstadisticasRaids(raids); // Llama a la función que muestra estadísticas de los raids

        //EJERCICIO 14
        System.out.println("\nEJERCICIO 14");
        HashMap<String, List<String>> mensajes = new HashMap<>(); // Crea un HashMap para los mensajes de cada jugador
        mensajes.put("Ana", new ArrayList<>(Arrays.asList("Hola", "Vendo espada", "Vendo espada")));
        // Agrega los mensajes de Ana
        mensajes.put("Luis", new ArrayList<>(Arrays.asList("Hola", "Busco grupo", "Gracias")));
        // Agrega los mensajes de Luis

        System.out.println("Silenciados: " + filtrarSpam(mensajes));
        // Llama a la función que filtra spam y muestra jugadores silenciados

        //EJERCICIO 15
        System.out.println("\nEJERCICIO 15");
        CasaSubastas casa = new CasaSubastas(); // Crea una instancia de la casa de subastas

        // Saldos de jugadores
        casa.añadirJugador("Ana", 700); // Agrega a Ana con saldo 500
        casa.añadirJugador("Luis", 500); // Agrega a Luis con saldo 300

        // Item en subasta
        casa.añadirItem("Excalibur"); // Agrega el ítem Excalibur a la subasta

        // Pujas
        casa.añadirPuja("Excalibur", new Puja("Ana", 450)); // Ana puja 450 por Excalibur
        casa.añadirPuja("Excalibur", new Puja("Luis", 350)); // Luis puja 350 por Excalibur
        casa.añadirPuja("Excalibur", new Puja("Ana", 200)); // Ana puja 200 por Excalibur

        // Procesar venta
        casa.procesarVenta("Excalibur"); // Procesa la subasta de Excalibur

        casa.mostrarSaldos();
    }

    //FUNCIONES PARA LOS EJERCICIOS

    //EJERCICIO 11: COMERCIO Y PRECIOS DINÁMICOS
    public static HashMap<String, Double> obtenerPreciosCiudad(
            String ciudad,
            HashMap<String, Double> preciosBase,
            HashMap<String, ArrayList<String>> ciudades) {

        HashMap<String, Double> preciosFinales = new HashMap<>(); // Crea el HashMap de precios finales

        ArrayList<String> items = ciudades.get(ciudad); // Obtiene los ítems de la ciudad
        boolean impuestoLujo = items.size() > 5; // Aplica impuesto si hay más de 5 ítems

        for (String item : items) { // Recorre cada ítem
            double precio = preciosBase.get(item); // Obtiene el precio base
            if (impuestoLujo) { // Si aplica impuesto
                precio *= 1.10; // Aumenta el precio un 10%
            }
            preciosFinales.put(item, precio); // Guarda el precio final en el HashMap
        }
        return preciosFinales; // Retorna los precios finales
    }

    //EJERCICIO 12: ÁRBOL DE HABILIDADES
    public static void desbloquearGolpeDivino(
            HashMap<String, HashMap<String, Boolean>> arbol,
            String clase) {

        HashMap<String, Boolean> habilidades = arbol.get(clase); // Obtiene las habilidades de la clase

        if (!habilidades.get("Enfoque")) { // Verifica si Enfoque está desbloqueado
            System.out.println("Error: primero debes desbloquear Enfoque."); // Mensaje de error
            return; // Sale de la función
        }

        habilidades.put("Golpe Divino", true); // Desbloquea Golpe Divino
        System.out.println("Golpe Divino desbloqueado."); // Mensaje de confirmación
    }

    //EJERCICIO 13: HISTORIAL DE INCURSIONES
    public static void mostrarEstadisticasRaids(
            HashMap<String, List<HashSet<String>>> historial) {

        // Contador de participaciones por jugador
        HashMap<String, Integer> contador = new HashMap<>();

        for (List<HashSet<String>> raids : historial.values()) { // Recorre todas las listas de raids
            for (HashSet<String> raid : raids) { // Recorre cada raid
                for (String jugador : raid) { // Recorre cada jugador
                    contador.put(jugador,
                            contador.getOrDefault(jugador, 0) + 1); // Suma 1 a sus participaciones
                }
            }
        }

        System.out.println("Participaciones por jugador:"); // Imprime título
        for (Map.Entry<String, Integer> e : contador.entrySet()) { // Recorre cada entrada del contador
            System.out.println(e.getKey() + " -> " + e.getValue()); // Imprime jugador y cantidad de participaciones
        }

        String mvp = null; // Variable para el jugador más valioso
        int max = 0; // Variable para el máximo de participaciones

        for (Map.Entry<String, Integer> e : contador.entrySet()) { // Recorre el contador
            if (e.getValue() > max) { // Si tiene más participaciones
                max = e.getValue(); // Actualiza máximo
                mvp = e.getKey(); // Actualiza MVP
            }
        }

        System.out.println("Jugador más valioso: " + mvp); // Imprime el MVP
        System.out.println("Participaciones totales: " + max); // Imprime la cantidad de participaciones del MVP
    }

    //EJERCICIO 14: SISTEMA ANTISPAM
    public static HashSet<String> filtrarSpam(
            HashMap<String, List<String>> mensajes) {

        HashSet<String> silenciados = new HashSet<>(); // Conjunto de jugadores silenciados

        for (String jugador : mensajes.keySet()) { // Recorre cada jugador

            List<String> lista = mensajes.get(jugador); // Obtiene los mensajes del jugador
            if (lista.size() < 3) continue; // Si hay menos de 3 mensajes, continúa

            List<String> ultimosTres =
                    lista.subList(lista.size() - 3, lista.size()); // Obtiene los últimos 3 mensajes

            if (new HashSet<>(ultimosTres).size() < ultimosTres.size()) {
                // Si hay mensajes repetidos
                silenciados.add(jugador); // Agrega al jugador a silenciados
                lista.clear(); // Limpia sus mensajes
            }
        }
        return silenciados; // Retorna los jugadores silenciados
    }
}
