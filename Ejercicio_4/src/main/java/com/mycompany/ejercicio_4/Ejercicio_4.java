/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_4;

import com.mycompany.ejercicio_4.CuentaB.Cuenta;
import com.mycompany.ejercicio_4.Servicios.Servicio;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        System.out.println("VAMOS A INGRESAR LOS DATOS DEL CLIENTE\n");
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Servicio m=new Servicio();
        Cuenta cuenta=m.ingresar();
        boolean imput=false;
        
        
        do{
            System.out.println("===BIENVENIDO===\nSELECCIONE OPCION");
            System.out.println("1-INGRESAR DINERO\n2-RETIRAR DINERO\n3-RETIRO RAPIDO\n4-CONSULTAR SALDO\n5-CONSULTAR DATOS\n6-SALIR\n================");
        int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    m.Ingreso(cuenta);
                    imput=true;
                    break;
                case 2:
                    m.Retirar(cuenta);
                    imput=true;
                    break;
                case 3:
                    m.extraccionRapida(cuenta);
                    imput=true;
                    break;
                case 4:
                    m.consultarSaldo(cuenta);
                    imput=true;
                    break;
                case 5:
                    m.consultarDatos(cuenta);
                    imput=true;
                    break;
                case 6:
                    System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                    imput=false;
                    break;
            }
            
        }while(imput==true);
    }
}
