/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_10.Atributos;

/**
 *
 * @author crowl
 */
public class Atributos {
    private double []array;
    private double []array1;

    public Atributos() {
        this.array=new double[50];
        this.array1=new double[20];
    }

    public Atributos(double[] array, double[] array1) {
        this.array = array;
        this.array1 = array1;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public double[] getArray1() {
        return array1;
    }

    public void setArray1(double[] array1) {
        this.array1 = array1;
    }

   
   
    
    
    
}

