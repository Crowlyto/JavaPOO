/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_7.Servicios;

import com.mycompany.ejercicio_7.Atributos.Persona;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Service {
    public Persona crearPersona(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Persona one=new Persona();
        System.out.println("Ingrese nombre");
        one.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        one.setApellido(leer.next());
        System.out.println("Ingrese genero\nMasculino(M)-Femenino(F)-Otro(O)");
        String sexo="";
        boolean flag=true;
        do{
            sexo=leer.next();
        if (sexo.equalsIgnoreCase("M")){
            one.setSexo(sexo);
            flag=true;
        }else if(sexo.equalsIgnoreCase("F")){
            one.setSexo(sexo);
            flag=true;
        }else if (sexo.equalsIgnoreCase("O")){
            one.setSexo(sexo);
            flag=true;
        }else{
            System.out.println("NO se reconoce tipo de genero\nReingrese");
            flag=false;
        }
        }while (flag==false);
        System.out.println("Ingrese la edad");
        one.setEdad(leer.nextInt());
        System.out.println("Ingrese altura");
        one.setAltura(leer.nextDouble());
        System.out.println("Ingrese peso");
        one.setPeso(leer.nextDouble());
        return one;
    }
    public void Mostrar(Persona one){
        System.out.println("-----------------");
        System.out.println("*Nombre: "+one.getNombre()+"\n*Apellido: "+one.getApellido()+"\n*Sexo: "
                +one.getSexo()+"\n*Edad: "+one.getEdad()+" años\n*Altura: "+one.getAltura()+" cm\n*Peso: "+one.getPeso()+" kg");
    }
    public int calcularIMC(Persona one){
        int condi=0;
        int imc=(int)one.getPeso()/(int)(one.getAltura()*one.getAltura());
        one.setIMC(imc);
        if (imc<20){
            condi=-1;
        }else if (imc<=25){
            condi=0;
        }else if (imc>25){
            condi=1;
        }
        return condi;
    }
    public boolean esMayor(Persona one){
        boolean flag;
        if (one.getEdad()<18){
            one.setEsMayor(false);
            flag=false;
        }else {
            one.setEsMayor(true);
            flag=true;
        }
        
        return flag;
    }
}
