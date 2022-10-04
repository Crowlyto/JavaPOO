/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9.Atributos;

/**
 *
 * @author crowl
 */
public class Matematica {
    double numero;
    double numero1;

    public Matematica() {
    }

    public Matematica(double numero, double numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero=" + numero + ", numero1=" + numero1 + '}';
    }
    
}
