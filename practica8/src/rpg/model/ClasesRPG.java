package rpg.model;

import java.util.ArrayList;
import java.util.List;

public class ClasesRPG {
    private int idClase;
    private String nombreClase;
    private List<Habilidades> tecnicasDisponibles;

    // Constructor simplificado
    public ClasesRPG(int idClase, String nombreClase) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.tecnicasDisponibles = new ArrayList<>();
    }

    // Getters y Setters con nombres cambiados
    public int getIdClase() {
        return idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public List<Habilidades> getTecnicasDisponibles() {
        return tecnicasDisponibles;
    }

    public void setTecnicasDisponibles(List<Habilidades> tecnicasDisponibles) {
        this.tecnicasDisponibles = tecnicasDisponibles;
    }

    public void agregarHabilidad(Habilidades habilidad) {
        this.tecnicasDisponibles.add(habilidad);
    }

    @Override
    public String toString() {
        return "Clases: " + nombreClase + " (Habilidades totales: " + tecnicasDisponibles.size() + ")";
    }
}