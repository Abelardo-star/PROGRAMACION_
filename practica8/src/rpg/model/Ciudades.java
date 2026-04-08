package rpg.model;

public class Ciudades {
    private int id;
    private String nombre;
    private int nivelMinimoAcceso;

    public Ciudades(int id, String nombre, int nivelMinimoAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.nivelMinimoAcceso = nivelMinimoAcceso;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelMinimoAcceso() {
        return nivelMinimoAcceso;
    }

    @Override
    public String toString() {
        return nombre + " (Nivel mínimo: " + nivelMinimoAcceso + ")";
    }
}