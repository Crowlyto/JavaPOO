/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        int anio,mes,dia;
        
        System.out.println("Ingrese año");
        anio=leer.nextInt();
        System.out.println("Ingrese Mes");
        mes=leer.nextInt();
        System.out.println("Ingrese Dia");
        dia=leer.nextInt();
        Date fecha=new Date(anio-1900, mes, dia);
        Date fechaActual=new Date();
        //System.out.println(" "+(fechaActual.getYear()-fecha.getYear())); 
        //System.out.println(""+fechaActual.getDate());
       int diferencia = (int) ((fechaActual.getTime() - fecha.getTime())/1000/60/60/24/365);
        System.out.println(""+diferencia);
    }
}
