package rpg.model;

import java.util.ArrayList;
import java.util.List;

public class Personajes {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vidaActual;


    private Razas raza;
    private ClasesRPG clase;
    private Ciudades ciudad;


    private List<Items> inventario;
    private List<Habilidades> habilidadesEquipadas;

    // Constructor para nuevos personajes
    public Personajes(int id, String nombre, Razas raza, ClasesRPG clase, Ciudades ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
        this.ciudad = ciudad;
        this.nivel = 1;
        this.vidaActual = 100;
        this.oro = 100;
        this.inventario = new ArrayList<>();
        this.habilidadesEquipadas = new ArrayList<>();
    }

    // Constructor para cargar desde la base de datos
    public Personajes(int id, String nombre, int nivel, int oro, int vidaActual, Razas raza, ClasesRPG clase, Ciudades ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vidaActual = vidaActual;
        this.raza = raza;
        this.clase = clase;
        this.ciudad = ciudad;
        this.inventario = new ArrayList<>();
        this.habilidadesEquipadas = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public Razas getRaza() {
        return raza;
    }

    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    public ClasesRPG getClase() {
        return clase;
    }

    public void setClase(ClasesRPG clase) {
        this.clase = clase;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public List<Items> getInventario() {
        return inventario;
    }

    public void setInventario(List<Items> inventario) {
        this.inventario = inventario;
    }

    public List<Habilidades> getHabilidadesEquipadas() {
        return habilidadesEquipadas;
    }

    public void setHabilidadesEquipadas(List<Habilidades> habilidadesEquipadas) {
        this.habilidadesEquipadas = habilidadesEquipadas;
    }

    @Override
    public String toString() {
        String nombreCiudad = "Desterrado";
        if (ciudad != null) {
            nombreCiudad = ciudad.getNombre();
        }

        return "PERSONAJE: " + nombre + " | Raza: " + raza.getNombre() + " | Clase: " + clase.getNombreClase() + " | Nivel: " + nivel + " | Oro: " + oro + " | Ciudad: " + nombreCiudad + " | Habilidades: " + habilidadesEquipadas.size() + " | Objetos: " + inventario.size();
    }
}