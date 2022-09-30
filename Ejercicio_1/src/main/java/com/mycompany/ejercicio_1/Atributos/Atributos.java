/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1.Atributos;

/**
 *
 * @author crowl
 */
public class Atributos {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int paginas;

    public Atributos() {
    }

    public Atributos(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Atributos{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
    
}
