/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import Core.megaferia.Editorial;
import Core.person.Autor;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class LibroDigital extends Libro {

    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(String titulo, ArrayList<Autor> Autores, String isbn, String genero, String formato, float valor, Editorial editorial,boolean hasHipervinculo, ArrayList<String> hipervinculos) {
        super(titulo, Autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;

    }

}
