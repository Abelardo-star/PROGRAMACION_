import java.util.*;

public class bloque2 {
    public static void main() {
        System.out.println("\n BLOQUE 2: DESAFÍOS DE LÓGICA ANIDADA");

        // 7. El Repositorio de Gremios
        System.out.println("\n Ejercicio 7: El Repositorio de Gremios");
        HashMap<String, ArrayList<String>> gremios = new HashMap<>();

        ArrayList<String> guerreros = new ArrayList<>();
        guerreros.add("Carlos");
        guerreros.add("Arturo");
        guerreros.add("Napoleon");
        ArrayList<String> magos = new ArrayList<>();
        magos.add("Pedro");
        magos.add("Lucas");
        magos.add("Judas"); //Judas agregado para el ejercicio 10

        gremios.put("Guerreros", guerreros);
        gremios.put("Magos", magos);

        VerMiembrosGremio(gremios, "Magos");

        // 8. El Sistema de Loot (Botín)
        System.out.println("\n Ejercicio 8: El Sistema de Loot ");
        HashMap<String, HashSet<String>> loot = new HashMap<>();
        HashSet<String> lootTrasgo = new HashSet<>();
        lootTrasgo.add("Espada Oxidada");
        lootTrasgo.add("Moneda de Oro");
        loot.put("Trasgo", lootTrasgo);

        // Intento de añadir duplicado
        boolean duplicado = loot.get("Trasgo").add("Espada Oxidada");
        System.out.println("¿Se añadió 'Espada Oxidada' otra vez?: " + duplicado);
        System.out.println("Loot del Trasgo: " + loot.get("Trasgo"));

        // 9. Rastreador de Estadísticas Complejas
        System.out.println("\n Ejercicio 9: Rastreador de Estadísticas ");
        HashMap<String, HashMap<String, Integer>> estadisticas = new HashMap<>();

        HashMap<String, Integer> statsConan = new HashMap<>();
        statsConan.put("Fuerza", 18);
        statsConan.put("Destreza", 12);
        estadisticas.put("Conan", statsConan);

        if (estadisticas.containsKey("Conan")) {
            HashMap<String, Integer> stats = estadisticas.get("Conan");
            if (stats.containsKey("Fuerza")) {
                stats.put("Fuerza", stats.get("Fuerza") + 2);
                System.out.println("Nueva fuerza de Conan: " + stats.get("Fuerza"));
            }
        }

        // 10. El Buscador de Traidores
        System.out.println("\n Ejercicio 10: El Buscador de Traidores ");
        BuscaYquitaTraidor(gremios, "Judas");
    }

    private static void VerMiembrosGremio(HashMap<String, ArrayList<String>> gremios, String nombreGremio) {
        if (gremios.containsKey(nombreGremio)) {
            System.out.println("Miembros de " + nombreGremio + ": " + gremios.get(nombreGremio));
        } else {
            System.out.println("Gremio no registrado.");
        }
    }

    private static void BuscaYquitaTraidor(HashMap<String, ArrayList<String>> gremios, String traidor) {
        for (Map.Entry<String, ArrayList<String>> entry : gremios.entrySet()) {
            ArrayList<String> miembros = entry.getValue();
            if (miembros.contains(traidor)) {
                System.out.println("¡Traidor " + traidor + " ha sido encontrado en el gremio de los  " + entry.getKey() + "!");
                miembros.remove(traidor);
                System.out.println("Traidor desterrado del gremio. Miembros restantes: " + miembros);
                return;
            }
        }
        System.out.println("Traidor no registrado.");
    }
}
