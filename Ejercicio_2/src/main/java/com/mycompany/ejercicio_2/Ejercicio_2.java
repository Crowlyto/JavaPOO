/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_2;

import com.mycompany.ejercicio_2.Circunferencia.Circun;
import com.mycompany.ejercicio_2.Service.Servicios;


public class Ejercicio_2 {

    public static void main(String[] args) {
        Servicios num1=new Servicios();
        Circun num=num1.crearCirscunferencia();
        double area=num1.calculoArea(num);
        double perimetro=num1.calculoPeri(num);
        System.out.println("Area: "+ area+"\nPerimetro: "+perimetro);
        
    }
}
