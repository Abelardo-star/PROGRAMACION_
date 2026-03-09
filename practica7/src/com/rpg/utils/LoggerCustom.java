package com.rpg.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerCustom {
    private static String Log = "practica7/ficheros/info.log";
    public static void Error(String mensaje){

        try{
            FileWriter fw = new FileWriter(Log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            LocalDateTime tiempo = LocalDateTime.now();
            DateTimeFormatter formateo = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fecha = tiempo.format(formateo);

            String linea = "{" + fecha + "}" + mensaje;

            bw.write(linea);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error al escribir en el log");
        }
    }
}
