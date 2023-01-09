package org.olmedo.archivos.ejemplos;

import org.olmedo.archivos.ejemplos.service.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/home/hiro/IdeaProjects/archivo/java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
