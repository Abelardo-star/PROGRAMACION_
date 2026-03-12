package com.rpg.services;

import com.rpg.handler.DatoInvalidoException;
import com.rpg.handler.FormatoInvalidoException;
import com.rpg.handler.RPGDataException;
import com.rpg.handler.RecursoNoEncontradoException;
import com.rpg.model.cuidades;
import com.rpg.model.item;
import com.rpg.model.personaje;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.TxtHelper;
import com.rpg.utils.LoggerCustom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionMundo {

    //lista para recorrer todas las clases
    private List<cuidades>  ciudades;
    private List<personaje> personajes;
    private List<item> objetos;

    //Para poder buscarlos por el id
    private Map<String, item> mobjetos;

    public GestionMundo() throws RPGDataException{
        ciudades = new ArrayList<>();
        personajes = new ArrayList<>();
        objetos = new ArrayList<>();
        mobjetos = new HashMap<>();

    }

    //Carga de Datos
    public void cargardatos() throws FormatoInvalidoException {

        try {

            System.out.println("Ciudades:");
            ciudades = TxtHelper.leerciudades();

            System.out.println("Personajes:");
            personajes = JsonHelper.leerPersonaje();

            System.out.println("Objetos:");
            objetos = JsonHelper.leerItem();

            for (item t : objetos) {
                mobjetos.put(t.getId(), t);
            }

            System.out.println("Objetos: " + mobjetos.size());

        } catch (FormatoInvalidoException e) {

            LoggerCustom.Error("Error cargando datos: " + e.getMessage());
            throw e;
        }
    }



    //Crear Personaje
    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItem)  throws RecursoNoEncontradoException, DatoInvalidoException {
        System.out.println("Creando personaje:");

        //personaje nuevo
        personaje nuevo = new personaje(nombre, raza, nivel);

        //lista para guardar los objetos
        List<item> equipo = new ArrayList<>();

        //If para ver si el nivel es negativo utilizando una excepcion
        if (nivel < 0) {
            LoggerCustom.Error("El nivel no puede ser inferior a 0");
            throw new DatoInvalidoException("El nivel no puede ser inferior a 0");
        }

        //recorremos los id de los objetos
        for (String id : idsItem) {
            item item = mobjetos.get(id);

            //ahora con un if vemos que si el el objeto no es nulo se añade si no tira la excepcion el el log
            if (item != null) {
                equipo.add(item);
            } else {
                LoggerCustom.Error("Objeto no existente: " + id);
                throw new RecursoNoEncontradoException("Objeto no existente: " + id);
            }

        }
        //ahora se asigna al personaje nuevo los objetos y se añade a la lista
        personajes.add(nuevo);
        nuevo.setEquipo(equipo);
        System.out.println("Personaje nuevo:\n" + nombre);
    }

     public void verPersonajeyObjetos(){
        System.out.println("Obteniendo personaje y objetos:");
        for (personaje p : personajes) {
            System.out.println("Personajes: " + p.getNombre());
            for (item t : objetos) {
                System.out.println("Objetos:\n " + t.getNombre() + " con el id: " + t.getId());
            }
        }
    }

    public void guardarCambios() throws FormatoInvalidoException {

        System.out.println("Guardando cambios en personajes.json");

        JsonHelper.guardarPersonajes(personajes);

    }
}


