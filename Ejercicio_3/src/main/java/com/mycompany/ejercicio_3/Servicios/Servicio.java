/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_3.Servicios;

import com.mycompany.ejercicio_3.Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicio {
     public Operacion crearOperacion(){        
         Scanner leer=new Scanner(System.in);
        Operacion op1= new Operacion();
        System.out.println("Ingrese el primer valor");
        op1.setNumero(leer.nextInt());
         System.out.println("Ingrese el segundo valor");
         op1.setNumero1(leer.nextInt());
         return op1;
     }
     public int sumar(Operacion op1){
         int suma=(op1.getNumero()+op1.getNumero1());
         return suma;
     }
     public int restar(Operacion op1){
         int resta=(op1.getNumero()-op1.getNumero1());
         return resta;
     }
     public int multiplicar(Operacion op1){
         if (op1.getNumero()==0||op1.getNumero1()==0){
             System.out.println("Error");
             return 0;
         }else{
             int multi=op1.getNumero()*op1.getNumero1();
             return multi;
         }
     }
     public double dividir(Operacion op1){
         if (op1.getNumero()==0||op1.getNumero1()==0){
             System.out.println("Error");
             return 0;
         }else{
             double divi=op1.getNumero()/op1.getNumero1();
             return divi;
         }
     }
}   
