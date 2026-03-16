import com.rpg.handler.RPGDataException;
import com.rpg.services.GestionMundo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws RPGDataException {

        GestionMundo mundo = new GestionMundo();

        mundo.cargardatos();

        mundo.ValidarEquipamiento("Licurgo",20);

        mundo.crearPersonaje("Kiki", "Enana", 20, new ArrayList<>(List.of("P01")),30);

        mundo.verPersonajeyObjetos();

        mundo.guardarCambios();

    }
}