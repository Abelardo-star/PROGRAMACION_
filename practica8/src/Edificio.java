import java.util.ArrayList;
import java.util.List;

public class Edificio {

    private String nombre;
    private String direccion;

    private List<Maquinaria> maquinarias;
    private List<Plantas> plantas;

    public Edificio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.maquinarias = new ArrayList<>();
        this.plantas = new ArrayList<>();
    }

    public void agregarMaquinaria(Maquinaria m) {
        maquinarias.add(m);
    }

    public void agregarPlanta(Plantas p) {
        plantas.add(p);
    }
}