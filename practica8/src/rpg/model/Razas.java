package rpg.model;

public class Razas {
    private int id;
    private String nombre;
    private int bonificadorVida;
    private int bonificadorFuerza;

    public Razas(int id, String nombre, int bonificadorVida, int bonificadorFuerza) {
        this.id = id;
        this.nombre = nombre;
        this.bonificadorVida = bonificadorVida;
        this.bonificadorFuerza = bonificadorFuerza;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBonificadorVida() {
        return bonificadorVida;
    }

    public int getBonificadorFuerza() {
        return bonificadorFuerza;
    }

    @Override
    public String toString() {
        return String.format("%s [Vida: %+d, Fuerza: %+d]", nombre, bonificadorVida, bonificadorFuerza);
    }
}