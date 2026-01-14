import com.juego.modelo.*;
import com.juego.presentacion.*;

public class Main {

    public static void main(String[] args){

        GestorPersonajes gestor = new GestorPersonajes();
        PrecargaDatos.cargar(gestor);

        new Presentador(new Vista(),gestor).iniciar();
    }
}
