package org.olmedo.archivos.ejemplos;

import org.olmedo.archivos.ejemplos.service.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

      String nombreArchivo = "/home/hiro/IdeaProjects/archivo/java.txt";

      ArchivoServicio service = new ArchivoServicio();
      service.crearArchivo2(nombreArchivo);
        
    }
}
