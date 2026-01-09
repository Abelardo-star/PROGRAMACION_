package Clases;

import java.util.HashMap;
import java.util.Map;

public class Clase {

    private String nombre;
    private Map<String, Integer> bonus;
    private int vidaMax;

    public Clase(String nombre, Map<String, Integer> bonus, int vidaMax) {
        this.nombre = nombre;
        this.bonus = bonus;
        this.vidaMax = vidaMax;
    }

    // Getters
    public String getNombre() { return nombre; }
    public Map<String, Integer> getBonus() { return bonus; }
    public int getVidaMax() { return vidaMax; }

    // Clases predefinidas
    public static final Map<String, Clase> CLASES = new HashMap<>();
    static {
        CLASES.put("Guerrero", new Clase("Guerrero", Map.of("fuerza", 3), 120));
        CLASES.put("Paladín", new Clase("Paladín", Map.of("fuerza", 2, "inteligencia", 1), 115));
        CLASES.put("Monje", new Clase("Monje", Map.of("fuerza", 2, "destreza", 1), 110));
        CLASES.put("Pícaro", new Clase("Pícaro", Map.of("destreza", 3), 105));
        CLASES.put("Druida", new Clase("Druida", Map.of("fuerza", 2, "inteligencia", 1), 100));
        CLASES.put("Sacerdote", new Clase("Sacerdote", Map.of("inteligencia", 3), 95));
        CLASES.put("Mago", new Clase("Mago", Map.of("inteligencia", 3), 90));
        CLASES.put("Bardo", new Clase("Bardo", Map.of("inteligencia", 3), 90));
    }
}

