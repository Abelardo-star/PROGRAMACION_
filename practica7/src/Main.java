import com.rpg.handler.RPGDataException;
import com.rpg.services.GestionMundo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws RPGDataException {

        GestionMundo mundo = new GestionMundo();

        mundo.cargardatos();

        mundo.crearPersonaje("Paquita", "Elfo", 10, new ArrayList<>(List.of("W01")));

        mundo.verPersonajeyObjetos();

        mundo.guardarCambios();

    }
}