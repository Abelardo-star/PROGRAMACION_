import java.util.ArrayList;
import java.util.List;

public class Plantas {

    private int numero;
    private String especialidad;
    private List<Espacios> espacios;

    public Plantas(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.espacios = new ArrayList<>();
    }

    public void agregarEspacio(Espacios e) {
        espacios.add(e);
    }
}