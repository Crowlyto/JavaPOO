/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1.Servicio;

import com.mycompany.ejercicio_1.Atributos.Atributos;
import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class ServicioLibro {
    public Atributos altaLibro(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Atributos m1=new Atributos();
        System.out.println("Ingrese el numero ISBN del Libro");
        m1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo del Libro");
        m1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del Libro");
        m1.setAutor(leer.next());
        System.out.println("Ingrese el número de paginas del Libro");
        m1.setPaginas(leer.nextInt());
        
        return m1;
    }
    public void mostrarInfo(Atributos m1){
        System.out.println("El numero de ISBN es "+m1.getISBN()+"\nTitulo: "+m1.getTitulo()+"\nAutor: "+m1.getAutor()+"\nTiene: "+m1.getPaginas()+" paginas");
        
    }
            
}
