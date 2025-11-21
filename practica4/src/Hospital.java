import java.util.ArrayList;

public class Hospital {
    private String Nombre;
    private String cif;
    private ArrayList<Areas> areas;

    public Hospital (String Nombre,String cif){
        this.Nombre= Nombre;
        this.cif= cif;
        this.areas= new ArrayList<>();
    }
    //GET

    public ArrayList<Areas> getAreas() {
        return areas;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCif() {
        return cif;
    }
    //SET

    public void setAreas(ArrayList<Areas> areas) {
        this.areas = areas;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    //ADD AGREGAR AREAS
    public void agregarAreas(Areas a){
        this.areas.add(a);
    }
}
