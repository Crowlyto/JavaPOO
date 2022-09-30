/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2.Circunferencia;

/**
 *
 * @author crowl
 */
public class Circun {
    private double Radio;

    public Circun() {
    }

    public Circun(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public String toString() {
        return "Circun{" + "Radio=" + Radio + '}';
    }
    
}
