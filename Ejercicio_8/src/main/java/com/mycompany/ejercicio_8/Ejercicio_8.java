/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_8;

import com.mycompany.ejercicio_8.Atributos.Atributos;
import com.mycompany.ejercicio_8.Servicio.Servicio;

/**
 *
 * @author crowl
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Servicio serv=new Servicio();
        Atributos fra=serv.tomarFrase();
        System.out.println("La frase contiene "+serv.mostrarVocal(fra)+" vocales");
        System.out.println("Le frase invertida quedaria\n"+serv.invertirFrase(fra));
        System.out.println(serv.vecesRepetido(fra)+" veces esta repetido en la frase");
        serv.compararLong(fra);
        serv.unirFrase(fra);
        System.out.println("Frase con caracter cambiado\n"+serv.reemplazar(fra));
        System.out.println(serv.contine(fra));
    }
}
