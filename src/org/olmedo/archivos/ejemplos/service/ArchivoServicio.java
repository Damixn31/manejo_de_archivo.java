package org.olmedo.archivos.ejemplos.service;


import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    // FileWriter cada ves que invocamos el write lo que es ir al archivo y escribir
    // BufferWriter es una forma mas optimizada del FileWriter
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {// el true permite aneczar el archivo solamente si el archivo existe

            buffer.append("Hola que tal amigos!\n").append("Todo bien? yo aca escribiendo un arvhico...\n")
                    .append("Hasta luego lucas!\n");
            //buffer.close(); // para que se escriba el archivo // con el buffer dentro den try no es necesario poner  close(
            System.out.println("El archivo se ha escrito con exito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // esto nos deja escribir en un archivo como si fuera una consola
    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {// el true permite aneczar el archivo solamente si el archivo existe

            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo aca escribiendo un arvhico...");
            buffer.printf("Hasta luego %s!", "Damian");
            //buffer.close(); // para que se escriba el archivo // con el buffer dentro den try no es necesario poner  close(
            System.out.println("El archivo se ha escrito con exito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // metodo para leer el contenido
    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            //reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){


            s.useDelimiter("\n");
            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
            //s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
