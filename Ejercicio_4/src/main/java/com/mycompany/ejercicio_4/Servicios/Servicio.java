/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4.Servicios;

import com.mycompany.ejercicio_4.CuentaB.Cuenta;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicio {
    public Cuenta ingresar(){
        Scanner leer=new Scanner(System.in);
        Cuenta num=new Cuenta();
        System.out.println("Ingrese el DNI del cliente");
        num.setDNI(leer.nextLong());
        System.out.println("Ingrese numero de cuenta");
        num.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo actual del cliente");
        num.setSaldoActual(leer.nextInt());
        return num;
        
    }
    public void Ingreso(Cuenta num){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el monto a depositar");
        int ingreso=leer.nextInt();
        int total=ingreso+num.getSaldoActual();
        num.setSaldoActual(total);
        }
    public void Retirar(Cuenta num){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el monto a retirar");
        int retiro=leer.nextInt();
        int total=0;
        if (num.getSaldoActual()<retiro){
            System.out.println("Saldo insuficiente");
        }else
            total=num.getSaldoActual()-retiro;
        num.setSaldoActual(total);   
    }
    public void extraccionRapida(Cuenta num){
       int saldo=num.getSaldoActual();
       double cant=0;
       cant=(saldo*0.20);
       int total=(int)(saldo-cant);
        System.out.println("Usted puede retirar $: "+cant);
        num.setSaldoActual(total);
       
    }
    public void consultarSaldo(Cuenta num){
        System.out.println("Su saldo es $: "+num.getSaldoActual());
    }
    public void consultarDatos(Cuenta num){
        System.out.println("Cliente DNI: "+num.getDNI()+"\nNumero de Cta: "+num.getNumeroCuenta()+"\nSaldo Actual: $"+num.getSaldoActual());
    }
    
}
