/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.proyectolistatareas;

import java.io.*;


public class FileHelper {
    
    private final static String LISTA_DE_TAREAS_FILE_PATH = "ListasDeTareas.txt";
    
    /**
     * Retorna los elementos dentro del archivo ListasDeTareas.txt, en forma de lista enlazada
     * 
     * @return Lista
     */
    public static Lista obtenerListasDeTareas() {
        
        try {
            
            Lista listaTareas = new Lista();
        
            // Carga el archivo situado en el path de la constante LISTA_DE_TAREAS_FILE_PATH
            File file = new File(LISTA_DE_TAREAS_FILE_PATH);

            // Abre el archivo para ser leido posteriormente utilizando la clase BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Recorre el archivo linea por line para convertirlas en objetos ListaTareas y agregarlos a la lista de retorno
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                
                // Divide la linea en distintos elementos utilizando el caracter ';' para delimitar cada attibuto
                String [] attributos = line.split(";");
                
                
                // Crea el objeto ListaTareas y lo agrega a la lista
                listaTareas.agregarAlFinal(new ListaTareas(attributos[0], attributos[1], attributos[2], attributos[3]));

            }
            
            // Retorna la lista con los elementos encontrados
            return listaTareas;
        
        } catch (IOException exception) {
            // En caso de error se imprime un mensaje de error y se loggea la excepcion en consola
            System.err.println("Error leyendo archivo ListasDeTareas");
            exception.printStackTrace();
            
        }
        
        return new Lista();
        
    }
    
    
    /**
     * Guarda la lista de tareas enviadas, en un archivo de texto (Sobreescribe el existente)
     * 
     * @param listaTareasList 
     */
    public static void guardarListasDeTareas(Lista listaTareasList) {
        
        try{
            // Crear un nuevo archivo y elimina el existente
            crearArchivoListasDeTareas();
            System.out.println("Archivo creado");
            
            // Abre el archivo ubicado en el path de la constante LISTA_DE_TAREAS_FILE_PATH
            FileWriter fileStream = new FileWriter (LISTA_DE_TAREAS_FILE_PATH);
            
            // Crea un buffer para escribir y guardar cambios en el archivo
            BufferedWriter writer = new BufferedWriter(fileStream);

            int size = listaTareasList.getTamanio();

            // Se recorre la lista para convertir sus elementos en lineas 
            // de texto para ser guardadas en el archivo
            for (int i = 0; i < size; i++) { 

                // Valida si el objeto en la lista es de tipo ListaTareas
                if(listaTareasList.getValor(i) instanceof ListaTareas) {
                    
                    // Obtiene el objeto en la lista utilizando un casting a la clase ListaTareas
                    ListaTareas lista = (ListaTareas) listaTareasList.getValor(i);
                    
                    // Convierte el objeto en una linea de texto para se guardada en el archivo
                    String lineaArchivo = lista.getId() + ";" + lista.getNombre() + ";" + lista.getDescripcion() + ";" + lista.getFecha();
                    
                    // Excribe la line de texto y agrega una nueva linea
                    writer.write(lineaArchivo);
                    writer.newLine();
                    
                    System.out.println("Linea guarda: " + lineaArchivo);
                    
                }

            }
            // Cierra el archivo
            writer.close();
            System.out.println("Archivo guardado");
            
        } catch (Exception ex) {
            System.err.print("Error guardando listas de tareas.");
            ex.printStackTrace();
        }
     
    }
    
    /**
     * Obtiene la lista de tareas usando la Lista indicada en el parametro del metodo
     * 
     * @param listaTareas
     * @return Lista de tareas
     */
    public static Lista obtenerTareasPorLista(ListaTareas listaTareas) {
        
        try {
            
            Lista tareasList = new Lista();
            
            // Carga el archivo de tareas usando el id de la lista como nombre del archivo
            File file = new File(listaTareas.getId() + ".txt");

            // Valida si el archivo existe
            if(file.exists()) {
                
                // Abre el archivo para ser leido posteriormente utilizando la clase BufferedReader
                BufferedReader br = new BufferedReader(new FileReader(file));

                // Recorre el archivo linea por line para convertirlas en objetos ListaTareas y agregarlos a la lista de retorno
                for (String line = br.readLine(); line != null; line = br.readLine()) {

                    // Divide la linea en distintos elementos utilizando el caracter ';' para delimitar cada attibuto
                    String [] attributos = line.split(";");


                    // Crea el objeto ListaTareas y lo agrega a la lista
                    tareasList.agregarAlFinal(new Tarea(attributos[0], attributos[1], attributos[2], attributos[3]));

                }
                
            }
            // Retorna la lista con los elementos encontrados
            return tareasList;
        
        } catch (IOException exception) {
            // En caso de error se imprime un mensaje de error y se loggea la excepcion en consola
            System.err.println("Error leyendo archivo de Tareas");
            exception.printStackTrace();
            
        }
        
        return new Lista();
        
    }
    
    /**
     * Guarda las tares de la lista de tareas indicada, dentro de un archivo de texto
     * 
     * @param listaId
     * @param tareasList 
     */
    public static void guardarListaDeTareas(String listaId, Lista tareasList) {
        
        try{
            // Crea un nuevo archivo de tareas y elimina el existente
            crearArchivoDeTareas(listaId);
            System.out.println("Archivo creado");
            
            // Abre el archivo usando el id de la lista como fileName
            FileWriter fileStream = new FileWriter (listaId + ".txt");
            
            // Crea un buffer para escribir y guardar cambios en el archivo
            BufferedWriter writer = new BufferedWriter(fileStream);

            int size = tareasList.getTamanio();

            // Se recorre la lista para convertir sus elementos en lineas 
            // de texto y asi ser guardadas en el archivo
            for (int i = 0; i < size; i++) { 

                // Valida si el objeto actual de la lista es de tipo Tarea
                if(tareasList.getValor(i) instanceof Tarea) {
                    
                    // Obtiene el objeto actual de la lista utilizando un casting a la clase Tareas
                    Tarea tareaItem = (Tarea) tareasList.getValor(i);
                    
                    // Convierte el objeto en una linea de texto para se guardada en el archivo
                    String lineaArchivo = tareaItem.getTarea()+ ";" + tareaItem.getPrioridad()+ ";" + tareaItem.getEstado()+ ";" + tareaItem.getNotas();
                    
                    // Excribe la line de texto y agrega una nueva linea
                    writer.write(lineaArchivo);
                    writer.newLine();
                    
                    System.out.println("Linea guarda: " + lineaArchivo);
                    
                }

            }
            // Cierra el archivo
            writer.close();
            System.out.println("Archivo guardado");
            
        } catch (Exception ex) {
            System.err.print("Error guardando lista de tareas.");
            ex.printStackTrace();
        }
     
    }
    
    
    
    /**
     * Crea un archivo nuevo para guardar las listas de tareas y borrara el ya existente
     * 
     */
    private static void crearArchivoListasDeTareas() {
      try {
          
        File file = new File(LISTA_DE_TAREAS_FILE_PATH);
        
        if (file.exists()) {
            // Si el archivo ya existe, lo elimina y para posteriormente crear uno nuevo
            file.delete();
        }
        
        // Crea un archivo nuevo con la ruta y el nombre asignado anteriormente
        file.createNewFile();
        
        
      } catch(IOException exception) {
          // En caso de error se imprime un mensaje de error y se loggea la excepcion en consola
          System.err.println("Error creando archivo de Listas de Tareas.");
          exception.printStackTrace();
      }
        
    }
    
    
    /**
     * Crea un archivo nuevo para guardar las tareas de una lista y elimina el ya existente
     * 
     */
    private static void crearArchivoDeTareas(String listaId) {
      try {
          
        File file = new File(listaId + ".txt");
        
        if (file.exists()) {
            // Si el archivo ya existe, lo elimina y para posteriormente crear uno nuevo
            file.delete();
        }
        
        // Crea un archivo nuevo con la ruta y el nombre asignado anteriormente
        file.createNewFile();
        
        
      } catch(IOException exception) {
          // En caso de error se imprime un mensaje de error y se loggea la excepcion en consola
          System.err.println("Error creando archivo de Listas de Tareas.");
          exception.printStackTrace();
      }
        
    }
    
    
}
