/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2.Service;

import com.mycompany.ejercicio_2.Circunferencia.Circun;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicios {
    public Circun crearCirscunferencia(){
        Scanner leer=new Scanner(System.in);
        Circun cir1=new Circun();
        System.out.println("Ingrese el radio de la Circunferencia");
        cir1.setRadio(leer.nextDouble());
        return cir1;
    }
    public double calculoArea(Circun cir1){
        double area=0;
        area=(PI*(cir1.getRadio()*cir1.getRadio()));
        return area;   
    }
    public double calculoPeri(Circun cir1){
        double perimetro;
        perimetro=(2*PI*cir1.getRadio());
        return perimetro;
    }
    
}
