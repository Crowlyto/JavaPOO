/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_6.Servicios;

import com.mycompany.ejercicio_6.Atributos.Cafetera;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Service {
    public Cafetera capacidad(){
        Scanner leer=new Scanner(System.in);
        Cafetera one=new Cafetera();
        System.out.println("INGRESE LA CAPACIDAD MAXIMA DE LA CAFETERA");
        one.setCapacidadMaxima(leer.nextDouble());
        return one;
    }
    public Cafetera llenar(Cafetera one){
        one.setCantidadActual(one.getCapacidadMaxima());
        return one;
    }
    public Cafetera servirTaza(Cafetera one){
        Scanner leer=new Scanner(System.in);
        boolean flag=false;
        String opcion="";
        
        do{
            System.out.println("Ingrese el tamaño de la taza");
            double taza=leer.nextDouble();
            if (taza<one.getCantidadActual()){
                one.setCantidadActual(one.getCantidadActual()-taza);
            }else {
                System.out.println("La cantidad no alcanza para llenar la taza");
            System.out.println("La taza se cargo con: "+one.getCantidadActual()+" cc");
            int cero=0;
            one.setCantidadActual(cero);
            }
            
            if(one.getCantidadActual()==0){
                System.out.println("Cafetera vacia\n Por favor llene la cafetera");
                flag=true;
            }else{
                System.out.println("Desea servir otra taza? S/N");
            opcion=leer.next();
            }
        }while (one.getCantidadActual()>0&& opcion.equalsIgnoreCase("S")&&flag==false);
        return one;
    }
    public Cafetera vaciarCafetera(Cafetera one){
        int vacio=0;
        one.setCantidadActual(vacio);
        System.out.println("La cafetera se ha vaciado");
        return one;
    }
    public Cafetera agregarCafe(Cafetera one){
        Scanner leer=new Scanner(System.in);
        System.out.println("La cafetera tiene: "+one.getCantidadActual()+" cc. de "+one.getCapacidadMaxima());
        System.out.println("Ingrese la cantidad con la que desea rellenar");
        double cant=leer.nextDouble();
        if (one.getCapacidadMaxima()<=(one.getCantidadActual()+cant)){
            one.setCantidadActual(cant+one.getCantidadActual());
        }else
            System.out.println("Se sobrepasa la capacidad maxima de la cafetera");
        return one;
    }
}
