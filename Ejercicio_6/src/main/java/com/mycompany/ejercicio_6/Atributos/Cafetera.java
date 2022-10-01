/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_6.Atributos;

/**
 *
 * @author crowl
 */
public class Cafetera {
    private double CapacidadMaxima;
    private double CantidadActual;
    

    public Cafetera() {
    }

    public Cafetera(double CapacidadMaxima, double CantidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    public double getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(double CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public double getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(double CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "CapacidadMaxima=" + CapacidadMaxima + ", CantidadActual=" + CantidadActual + '}';
    }
    
}
