/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8.Atributos;

/**
 *
 * @author crowl
 */
public class Atributos {
    private String Cadena;
    private int largo;

    public Atributos() {
    }

    public Atributos(String Cadena, int largo) {
        this.Cadena = Cadena;
        this.largo = largo;
    }

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Atributos{" + "Cadena=" + Cadena + ", largo=" + largo + '}';
    }
    
    
    
}
