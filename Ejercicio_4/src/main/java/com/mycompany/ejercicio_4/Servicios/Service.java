/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4.Servicios;

import com.mycompany.ejercicio_4.Atributos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Service {
    public Rectangulo modelar(){
        Scanner leer=new Scanner(System.in);
        Rectangulo one=new Rectangulo();
        System.out.println("VAMOS A DIBUJAR UN RECTANGULO Y CALCULAR SU AREA Y PERIMETRO");
        System.out.println("INGRESE LA BASE");
        one.setBase(leer.nextInt());
        System.out.println("INGRESE LA ALTURA");
        one.setAltura(leer.nextInt());
        return one;  
    }
    public int calcularPerimetro(Rectangulo one){
        int perimetro;
        perimetro=(one.getBase()+one.getAltura())*2;
        return perimetro;
    }
    public int calcularArea(Rectangulo one){
        int area;
        area=one.getBase()*one.getAltura();
        return area;
    }
    public void dibujarRectangulo(Rectangulo one) {
       
        int base=one.getBase();
        int altura=one.getAltura();
        for (int i=1;i<base;i++){
            System.out.print("*");
        }
        System.out.println("*");
        for (int j=1;j<altura-1;j++){
            System.out.print("*");
            for (int k=1;k<=base-2;k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int l=1;l<base;l++){
            System.out.print("*");
        }
        System.out.println("*");
    }
}
