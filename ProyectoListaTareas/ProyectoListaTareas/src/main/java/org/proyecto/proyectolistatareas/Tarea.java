/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.proyectolistatareas;


public class Tarea {
    
    private String tarea;
    private String prioridad;
    private String estado;
    private String notas;

    public Tarea(String tarea, String prioridad, String estado, String notas) {
        this.tarea = tarea;
        this.prioridad = prioridad;
        this.estado = estado;
        this.notas = notas;
    }

    public String getTarea() {
        return tarea;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
    
    
    
}
