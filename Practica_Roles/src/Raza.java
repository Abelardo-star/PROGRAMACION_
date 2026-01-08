import java.util.Arrays;
import java.util.List;

public class Raza{

    private final String nombre;
    private final int fuerza;
    private final int inteligencia;
    private final int destreza;
    private final int vida;
    private final String especialidad;

    public Raza(String nombre, int fuerza, int inteligencia, int destreza, int vida, String especialidad) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vida = vida;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getVida() {
        return vida;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // ===== RAZAS DEFINIDAS =====
    public static final Raza HUMANO = new Raza(
            "Humano", 5, 5, 5, 100, "Equilibrado: Versátil para cualquier clase"
    );

    public static final Raza ELFO = new Raza(
            "Elfo", 4, 6, 7, 90, "Agilidad: Ideal para Pícaros, Magos y Bardos"
    );

    public static final Raza ENANO = new Raza(
            "Enano", 7, 4, 4, 110, "Resistencia: Ideal para Guerreros y Paladines"
    );

    public static final List<Raza> RAZAS = Arrays.asList(
            HUMANO, ELFO, ENANO
    );
}