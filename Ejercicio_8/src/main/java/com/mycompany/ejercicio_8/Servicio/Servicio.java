/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8.Servicio;

import com.mycompany.ejercicio_8.Atributos.Atributos;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Servicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Atributos tomarFrase(){
        Atributos one=new Atributos();
        System.out.println("INGRESE UNA FRASE");
        one.setCadena(leer.next());
        one.setLargo(one.getCadena().length());
        return one;
    }
    public int mostrarVocal(Atributos one){
        int voc=0;
        for (int i=0;i<one.getLargo();i++){
            if (one.getCadena().substring(i,i+1).equalsIgnoreCase("A")||one.getCadena().substring(i,i+1).equalsIgnoreCase("E")||one.getCadena().substring(i,i+1).equalsIgnoreCase("I")||one.getCadena().substring(i,i+1).equalsIgnoreCase("O")||one.getCadena().substring(i,i+1).equalsIgnoreCase("U")){
                voc++;
            }
            
        }
        return voc;
    }
    public String invertirFrase(Atributos one){
        String invertida="";//Declarar cadena vacia
        
        for (int i=one.getLargo()-1;i>=0;i--){//for desde el largo de la cadena original hasta 0 i--
            invertida +=one.getCadena().charAt(i);
        }
        return invertida;
    }
    public int vecesRepetido(Atributos one){
        int repe=0;
        System.out.println("Ingrese Caracter");
        String carac=leer.next();
        for (int i=0;i<one.getLargo();i++){
            if (one.getCadena().substring(i,i+1).equalsIgnoreCase(carac)){
                repe++;
            }
        }
        return repe;
    }
    public void compararLong(Atributos one){
        System.out.println("Ingrese nueva frase a comparar largo");
        String nuevaFrase=leer.next();
        one.setNuevafrase(nuevaFrase);
        if (nuevaFrase.length()==one.getCadena().length()){
            System.out.println("Las frases tiene el mismo largo");
        }else{
            System.out.println("La primer frase tiene un largo de "+one.getLargo());
            System.out.println("La segunda frase tiene un largo de "+nuevaFrase.length());
        }
    }
    public void unirFrase(Atributos one){
        System.out.println("Las frases unidas quedarian:\n "+one.getCadena()+one.getNuevafrase());
    }
    public String reemplazar(Atributos one){
        System.out.println("Ingrese caracter para reemplazar la letra -A-");
        String cara=leer.next();
        String cambiada=one.getCadena().replace("A", cara);
        cambiada=one.getCadena().replace("a",cara);
        return cambiada;    
        }
    public boolean contine(Atributos one){
        boolean flag=false;
        System.out.println("Ingrese una letra a comprobar");
        String chara=leer.next();
        for (int i=0;i<one.getLargo();i++){
            if (one.getCadena().substring(i,i+1).equalsIgnoreCase(chara)){
                flag=true;
            }
        }
        return flag;
    }
    }

