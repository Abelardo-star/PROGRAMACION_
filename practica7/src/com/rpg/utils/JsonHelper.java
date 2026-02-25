package com.rpg.utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.cuidades;

import java.util.List;

public class JsonHelper {

    public JsonHelper() {
    }

    private String reader;

    List<cuidades> lista = new Gson().fromJson(reader, new TypeToken<List<cuidades>>() {}.getType());

    public static List<cuidades> readListcuidades(String path) {

    }
}
