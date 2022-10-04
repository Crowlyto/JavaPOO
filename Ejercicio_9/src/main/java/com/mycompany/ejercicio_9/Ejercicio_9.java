/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_9;

import com.mycompany.ejercicio_9.Atributos.Matematica;
import com.mycompany.ejercicio_9.Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Servicio serv=new Servicio();
        int opcion;
        Matematica mat=new Matematica();
        do{
            System.out.println("===MENU===");
            System.out.println("1-CREAR DOS VALORES ALEATORIOS\n2-COMPROBAR MAYOR\n3-CALCULAR POTENCIA DEL MAYOR ELEVADO AL MENOR\n4-CALCULAR RAIZ\n5-SALIR\n==========");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                    mat=serv.crear();
                    break;
                case 2:
                    serv.devolverMayor(mat);
                    break;
                case 3:
                    serv.calcularPotencia(mat);
                    break;
                case 4:
                    serv.calcularRaiz(mat);
                    break;
                case 5:
                    System.out.println("USTED HA SALIDO");
            }
            System.out.println("==========");
        }while (opcion!=5);
        
    }
}
