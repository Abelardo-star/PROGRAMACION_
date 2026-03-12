package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.handler.FormatoInvalidoException;
import com.rpg.model.item;
import com.rpg.model.personaje;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonHelper {

    public JsonHelper(){}
    public static List<item> leerItem() throws FormatoInvalidoException  {

        try {
            FileReader reader = new FileReader("practica7/ficheros/item.json");
            Gson g = new Gson();
            List<item> listaItem = g.fromJson(reader, new TypeToken<List<item>>() {}.getType());

            for (item t : listaItem) {
                System.out.println(t.getNombre());
            }
            return listaItem;

        } catch (Exception e) {
            throw new FormatoInvalidoException("Error de formato en item.json");
        }
    }
    public static List<personaje> leerPersonaje() throws FormatoInvalidoException {

        try {
            FileReader reader = new FileReader("practica7/ficheros/personaje.json");
            Gson g = new Gson();
            List<personaje> listaPersonaje = g.fromJson(reader, new TypeToken<List<personaje>>() {}.getType());

            for (personaje p : listaPersonaje) {
                System.out.println(p.getNombre());
            }
            return listaPersonaje;
        } catch (FileNotFoundException e) {
            throw new FormatoInvalidoException("Error de formato en personaje.json");
        }
    }
}





















