public class Puja {

    // Nombre del jugador que realiza la puja
    private String jugador;

    // Cantidad de oro ofrecida en la puja
    private double cantidad;

    // Constructor: crea una nueva puja con jugador y cantidad
    public Puja(String jugador, double cantidad) {
        this.jugador = jugador;
        this.cantidad = cantidad;
    }

    // Devuelve el nombre del jugador que hizo la puja
    public String getJugador() {
        return jugador;
    }

    // Devuelve la cantidad de oro de la puja
    public double getCantidad() {
        return cantidad;
    }
}
