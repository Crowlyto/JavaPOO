/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_10.Servicios;

import com.mycompany.ejercicio_10.Atributos.Atributos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Atributos llenar() {
        Atributos one = new Atributos();
        double aux[] = new double[50];
        for (int i = 0; i < 50; i++) {
            aux[i] = (double) Math.random() * 100;
        }
        one.setArray(aux);

        return one;
    }

    public void mostrar(Atributos one) {
        for (int i = 0; i < 50; i++) {
            System.out.print("["+one.getArray()[i]+" ]");
        }
    }
    public void ordenar(Atributos one){
       double []aux=new double[50];
       for (int i=0;i<50;i++){
           aux[i]=one.getArray()[i];
       }
        Arrays.sort(aux);
        one.setArray(aux);
//         for (int i = 0; i < 50; i++) {
//            System.out.print("["+one.getArray()[i]+" ]");
//        }
    }
    public void copiar(Atributos one){
        double []aux=new double[20];
         for (int i=0;i<20;i++){
             if (i<10){
                 aux[i]=one.getArray()[i];
             }else 
                 aux[i]=0.5;
         }
         one.setArray1(aux);
         for (int i=0;i<20;i++){
             System.out.print("["+one.getArray1()[i]+" ]");
         }
         
    }
}
