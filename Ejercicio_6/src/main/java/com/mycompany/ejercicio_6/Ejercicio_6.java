/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_6;

import com.mycompany.ejercicio_6.Atributos.Cafetera;
import com.mycompany.ejercicio_6.Servicios.Service;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Service serv=new Service();
        System.out.println("BIENVENIDO A SU CAFETERA NESPRESSO\n==============");
        Cafetera one=serv.capacidad();
        int opcion=0;
       do{
           
           System.out.println("==============\nSELCCIONE OPCION");
           System.out.println("1-LLENAR CAFETERA\n2-SERVIR TAZA\n3-VACIAR CAFETERA\n4-AGREGAR CAFE\n5-CONSULTAR CANTIDAD DE CAFE\n6-SALIR\n==============");
           opcion=leer.nextInt();
           switch (opcion){
               case 1:
                   serv.llenar(one);
                   break;
               case 2:
                   serv.servirTaza(one);
                   break;
               case 3:
                   serv.vaciarCafetera(one);
                   break;
               case 4:
                   serv.agregarCafe(one);
                   break;
               case 5:
                   System.out.println("La cantidad de cafe en su NESPRESSO ES DE: "+one.getCantidadActual()+" cc");
                   break;
               case 6:
                   System.out.println("GRACIAS POR USAR NESPRESSO");
                   break;
           }
          
       }while (opcion!=6); 
    }
}
