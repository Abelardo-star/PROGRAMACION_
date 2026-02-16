import java.util.HashSet;

public class AltaSeguridad extends Espacios {

    private String nombre;
    private HashSet<String> registroAccesos;

    public AltaSeguridad(double tamano, String nombre) {
        super(tamano);
        this.nombre = nombre;
        this.registroAccesos = new HashSet<>();
    }

    public void validacionBiometrica(int ordenLlegada, String dni) {
        String registro = "Orden: " + ordenLlegada + " DNI: " + dni;
        registroAccesos.add(registro);
        System.out.println("Acceso autorizado en zona de alta seguridad para DNI: " + dni);
    }
}