package rpg.logic;

import rpg.dao.*;
import rpg.exception.*;
import rpg.model.*;
import rpg.ui.Vista;
import rpg.utils.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionMundo {
    private Vista vista;
    private CiudadesDao ciudadesDao;
    private ItemsDao itemsDao;
    private RazasDao razasDao;
    private ClasesRPGDao clasesRPGDao;
    private HabilidadDao habilidadDao;
    private PersonajesDao personajesDao;
    private EventosMundo eventos;

    public GestionMundo() {
        this.vista = new Vista();
        this.ciudadesDao = new CiudadesDao();
        this.itemsDao = new ItemsDao();
        this.razasDao = new RazasDao();
        this.habilidadDao = new HabilidadDao();
        this.clasesRPGDao = new ClasesRPGDao(habilidadDao);
        this.eventos = new EventosMundo();
        this.personajesDao = new PersonajesDao(itemsDao, habilidadDao);
        personajesDao.cargarPersonajes(ciudadesDao, razasDao, clasesRPGDao);

        iniciar();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenuPrincipal();
            manejarOpcion(opcion);
        } while (opcion != 0);
    }

    public void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearPersonaje();
            case 2 -> viajarACiudad();
            case 3 -> irALaTienda();
            case 4 -> {
                // Cobro de impuestos con Iterator
                eventos.cobrarImpuestos(personajesDao.getListaPersonajes(), personajesDao);
                vista.mostrarMensaje("Impuestos procesados. Los morosos han sido desterrados.");
            }
            case 6 -> mostrarEstadisticasGremio(personajesDao.getListaPersonajes());
            case 0 -> vista.mostrarMensaje("Cerrando conexión con el reino...");
            default -> vista.mostrarMensaje("Opción no válida");
        }
    }


    public void crearPersonaje() {
        vista.mostrarMensaje("\n--- RECLUTAR NUEVO HÉROE ---");
        String nombre = vista.pedirNombre();

        vista.mostrarListaRazas(razasDao.getListaRazas());
        int idRaza = vista.pedirIdRaza();

        vista.mostrarListaClases(clasesRPGDao.getListaClases());
        int idClase = vista.pedirIdClase();

        personajesDao.insertarNuevoPersonaje(nombre, idRaza, idClase);
        System.out.println("Nuevo aventurero: " + nombre);
        vista.mostrarMensaje("¡Personaje guardado en la base de datos!");
    }

    public void viajarACiudad() {
        vista.mostrarListaPersonajesNivel(personajesDao.getListaPersonajes());
        int idPersonaje = vista.pedirIdPersonaje();
        Personajes psel = personajesDao.buscarPorId(idPersonaje);

        if (psel == null) return;

        vista.mostrarListaCiudades(ciudadesDao.getListaCiudades());
        int idCiudad = vista.pedirIdCiudadViaje(psel);
        Ciudades ciudad = ciudadesDao.buscarPorId(idCiudad);

        try {
            if (psel.getNivel() < ciudad.getNivelMinimoAcceso()) {
                throw new NivelInsuficienteException("Nivel insuficiente. Necesitas nivel " + ciudad.getNivelMinimoAcceso());
            }

            personajesDao.ActualizarCuidad(idCiudad, idPersonaje);
            psel.setCiudad(ciudad);
            vista.mostrarMensaje("Viaje exitoso a " + ciudad.getNombre());

        } catch (NivelInsuficienteException e) {
            Log.Error("Intento de viaje fallido: " + e.getMessage());
            vista.mostrarMensaje(e.getMessage());
        }
    }

    public void irALaTienda() {
        vista.mostrarListaPersonajesResumida(personajesDao.getListaPersonajes());
        int idPersonaje = vista.pedirIdPersonaje();
        Personajes pSel = personajesDao.buscarPorId(idPersonaje);

        if (pSel == null) return;

        boolean seguir = true;
        while (seguir) {
            vista.mostrarListaItems(itemsDao.getListaItems());
            int idItem = vista.pedirOpcionTienda();
            Items item = itemsDao.buscarPorId(idItem);

            if (item != null) {
                try {
                    if (pSel.getOro() < item.getPrecioOro()) {
                        throw new FondosInsuficientesException("No tienes suficientes monedas de oro.");
                    }

                    int nuevoOro = pSel.getOro() - item.getPrecioOro();
                    pSel.setOro(nuevoOro);

                    personajesDao.actualizarOro(idPersonaje, nuevoOro);
                    personajesDao.registrarItemEnInventario(idPersonaje, item.getId());

                    System.out.println("Compra: " + pSel.getNombre() + " obtuvo " + item.getNombre());
                    vista.mostrarMensaje("¡Objeto adquirido!");

                } catch (FondosInsuficientesException e) {
                    Log.Error("Fallo en tienda: " + e.getMessage());
                    vista.mostrarMensaje(e.getMessage());
                }
            }
            if (vista.pedirConfirmacion() != 0) seguir = false;
        }
    }


    public void mostrarEstadisticasGremio(List<Personajes> aventureros) {
        Map<String, Integer> estadisticas = new HashMap<>();

        for (Personajes p : aventureros) {
            String clase = p.getClase().getNombreClase();
            estadisticas.put(clase, estadisticas.getOrDefault(clase, 0) + 1);
        }

        vista.mostrarMensaje("\nESTADÍSTICAS DEL GREMIO (HÉROES POR CLASE) ---");
        System.out.println(estadisticas);
    }
}