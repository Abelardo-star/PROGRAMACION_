package rpg.logic;

import rpg.dao.PersonajesDao;
import rpg.model.Personajes;
import rpg.utils.Log;
import java.util.Iterator;
import java.util.List;

public class EventosMundo {

    public void cobrarImpuestos(List<Personajes> residentes, PersonajesDao personajesDAO) {
        Iterator<Personajes> lector = residentes.iterator();

        while(lector.hasNext()) {
            Personajes p = lector.next();

            int oroActualizado = p.getOro() - 20;
            p.setOro(oroActualizado);
            if (p.getOro() < 0) {
                lector.remove();
                personajesDAO.desterrarPersonaje(p.getId());
                personajesDAO.actualizarOro(p.getId(), p.getOro());

                Log.Error("Evento: " + p.getNombre() + " desterrado por impago.");
            } else {
                personajesDAO.actualizarOro(p.getId(), p.getOro());
            }
        }
    }
}