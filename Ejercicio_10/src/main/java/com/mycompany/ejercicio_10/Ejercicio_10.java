/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_10;

import com.mycompany.ejercicio_10.Atributos.Atributos;
import com.mycompany.ejercicio_10.Servicios.Servicios;

/**
 *
 * @author crowl
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Servicios serv=new Servicios ();
        Atributos two=serv.llenar();
        serv.mostrar(two);
        System.out.println("");   
        serv.ordenar(two);
        System.out.println("");
        serv.copiar(two);
    }
}
/* el de Damian
double []a= new double[50];
        double []b= new double[20];
        double c;
        for (int i = 0; i < 50; i++) {
            a[i]=Math.random();
           
           
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("arrelo a ordenado");
         System.out.println(Arrays.toString(a));
         System.out.println("arreglo b");
      
        for (int i = 0; i < 10; i++) {
             c=a[i];
            Arrays.fill(b, i, 10, c);
        }
        for (int i = 10; i < 20; i++) {
             Arrays.fill(b, i, 20, 0.5);
        }
         System.out.println(Arrays.toString(b));

*/