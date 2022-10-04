/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_7;

import com.mycompany.ejercicio_7.Atributos.Persona;
import com.mycompany.ejercicio_7.Servicios.Service;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Service serv = new Service();
        System.out.println("SISTEMA DE CARGA\n==========");
        Persona[] pers = new Persona[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("==========\nCARGA PERSONA " + (i + 1));
            pers[i] = serv.crearPersona();
        }
        System.out.println("SELECCIONE UNA OPCION\n1-MOSTRAR DATOS\n2-EVALUACION DE PESO\n3-CONDICION DE EDAD\n4-SALIR");
        int opcion = leer.nextInt();
        int pesof = 0, peson = 0, pesoa = 0;
        int cant = pers.length;

        do {
            switch (opcion) {
                case 1:
                    System.out.println("DATOS");
                    for (int j = 0; j <pers.length; j++) {
                        System.out.println("==========\nDATOS PERSONA " + (j + 1));
                        serv.Mostrar(pers[j]);
                    }
                    break;
                case 2:
                    System.out.println("EVALUACION");
                    for (int i = 0; i < 2; i++) {
                        System.out.println();
                        if (serv.calcularIMC(pers[i]) == -1) {
                            pesof++;
                        } else if (serv.calcularIMC(pers[i]) == 0) {
                            peson++;
                        } else  if(serv.calcularIMC(pers[i]) == 1) {
                            pesoa++;
                        }
                    }
                    System.out.println("El porcentaje de personas con bajo peso es de: " + (pesof * 100 / cant) + " %");
                    System.out.println("El porcentaje de personas con bajo peso es de: " + (peson * 100 / cant) + " %");
                    System.out.println("El porcentaje de personas con bajo peso es de: " + (pesoa * 100 / cant) + " %");
                    break;
                case 3:
                    int may = 0,
                     men = 0;
                    for (int i = 0; i < 2; i++) {
                        if (serv.esMayor(pers[i]) == true) {
                            may++;
                        } else {
                            men++;
                        }
                    }
                    System.out.println("Porcetaje de personas mayores: " + may * 100 / cant + " %");
                    System.out.println("Porcentaje de personar menores: " + men * 100 / cant + " %");
                    break;
                case 4:
                    System.out.println("Hasta la proxima");

                    break;

            }
        } while (opcion != 4&&cant<4);

    }
}
