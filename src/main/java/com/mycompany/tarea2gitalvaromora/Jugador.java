/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea2gitalvaromora;

/**
 *
 * @author Álvaro
 */
public class Jugador {
    
    String nombre;
    int votos;
    int id;

    public Jugador(String nombre, int votos, int id) {
        this.nombre = nombre;
        this.votos = votos;
        this.id = id;
    }
    
    public static void main(String[] args) {
       Jugador jugador1=new Jugador("Alvaro",10,13);
    }
}
