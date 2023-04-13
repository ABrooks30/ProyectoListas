/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.proyectolistatareas;


public class Nodo{

    private Object valor;
    private Nodo siguiente;

    public Nodo() {

    }

    public Nodo (int val, Nodo sig){
        valor = val;
        siguiente = sig;
    }
    public Object getValor(){
        return valor;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setValor(Object val){
        valor = val;
    }
    public void setSiguiente(Nodo sig){
        siguiente = sig;
    }
    
}
