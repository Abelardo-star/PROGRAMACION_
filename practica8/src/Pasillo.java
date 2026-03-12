public class Pasillo extends Comunes {

    private double longitud;
    private double ancho;

    public Pasillo(double tamano, String nombre, double longitud, double ancho) {
        super(tamano, nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }
}