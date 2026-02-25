package com.rpg.utils;
import com.rpg.model.cuidades;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {

    public TxtHelper(){ }

    public static List<cuidades> leerciudades() {

        List<cuidades> listaciudades = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(
                    Paths.get("practica7/ficheros/cuidades.txt"));

            for (String linea : lineas) {

                String[] s = linea.split(";");

                cuidades c = new cuidades(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );

                listaciudades.add(c);
            }

            for (cuidades c : listaciudades) {
                System.out.println(c.getNombre());
            }


        } catch (IOException e) {
            System.out.println("No ha podido abrise el archivo: " + e.getMessage());
            return listaciudades;
        }

        return listaciudades;
    }
}