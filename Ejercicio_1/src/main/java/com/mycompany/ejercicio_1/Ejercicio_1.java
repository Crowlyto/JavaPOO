/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_1;

import com.mycompany.ejercicio_1.Atributos.Atributos;
import com.mycompany.ejercicio_1.Servicio.ServicioLibro;

/**
 *
 * @author crowl
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        ServicioLibro n1= new ServicioLibro();
        Atributos m1=n1.altaLibro();
        n1.mostrarInfo(m1);
        
    }
}
