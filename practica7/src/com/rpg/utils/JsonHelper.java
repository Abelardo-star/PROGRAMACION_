package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.item;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {

    public JsonHelper(){}
    public static List<item> leerItem() {

        List<item> listaItem = new ArrayList<>();

        try {
            FileReader reader = new FileReader("practica7/ficheros/item.json");
            Gson g = new Gson();
            List<item> lista = g.fromJson(reader, new TypeToken<List<item>>() {
            }.getType());

            for (item t : lista) {
                System.out.println(t.getNombre());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaItem;
    }
}





















