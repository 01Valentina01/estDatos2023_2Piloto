/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.tarea;

/**
 *
 * @author sg702-08
 */
public enum IngTeleco {
    
    Primersemestre(6,16),
    Segundosemestre(5,16),
    Tercersemestre(5,16),
    Cuartosemestre(5,16),
    Quintosemestre(5,16),
    Sextosemestre(5,16),
    Septimosemestre(5,16),
    Octavosemestre(5,16),
    Novenosemestre(5,16),
    Decimosemestre(3,16);
    
    private int cantMaterias;
    private int creditos;

    //constructor

    private IngTeleco(int cantMaterias, int creditos) {
        this.cantMaterias = cantMaterias;
        this.creditos = creditos;
    }
  
    //toString
    @Override
    public String toString() {
        return "ing Telecomunicaciones-> " + "Numero de Materias=" + cantMaterias + "  Numero de creditos=" + creditos ;
    }
}
