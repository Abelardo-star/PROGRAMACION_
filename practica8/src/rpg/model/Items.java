package rpg.model;

public class Items {
    private int id;
    private String nombre;
    private String tipo;
    private int precioOro;
    private int bonificadorAtaque;
    private int bonificadorDefensa;

    public Items(int id, String nombre, String tipo, int precioOro, int bonificadorAtaque, int bonificadorDefensa) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioOro = precioOro;
        this.bonificadorAtaque = bonificadorAtaque;
        this.bonificadorDefensa = bonificadorDefensa;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioOro() {
        return precioOro;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-10s | %d oro | ATQ: +%d | DEF: +%d", nombre, tipo, precioOro, bonificadorAtaque, bonificadorDefensa);
    }
}