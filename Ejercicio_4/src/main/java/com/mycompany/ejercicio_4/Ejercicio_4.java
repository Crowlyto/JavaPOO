/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_4;

import com.mycompany.ejercicio_4.Atributos.Rectangulo;
import com.mycompany.ejercicio_4.Servicios.Service;

/**
 *
 * @author crowl
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        Service serv=new Service();
        Rectangulo rect=serv.modelar();
        serv.calcularArea(rect);
        serv.calcularPerimetro(rect);
        serv.dibujarRectangulo(rect);
        
    }
}
