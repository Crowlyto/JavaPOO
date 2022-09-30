/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_3;

import com.mycompany.ejercicio_3.Operacion.Operacion;
import com.mycompany.ejercicio_3.Servicios.Servicio;


public class Ejercicio_3 {

    public static void main(String[] args) {
        Servicio cal=new Servicio();
        Operacion num=cal.crearOperacion();
        System.out.println("Suma "+cal.sumar(num));
        System.out.println("Resta "+cal.restar(num));
        System.out.println("Multiplicacion "+cal.multiplicar(num));
        System.out.println("Division "+cal.dividir(num));
        
    }
    }
