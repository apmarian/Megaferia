/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import Core.megaferia.Editorial;
import Core.person.Narrador;
import Core.person.Autor;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Audiolibro extends Libro{
    private int duracion; 
    private Narrador narrador; 
    
    public Audiolibro(String titulo, ArrayList<Autor> Autores, String isbn, String genero, String formato, float valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, Autores, isbn, genero, formato, valor, editorial);
        
        this.duracion= duracion;
        this.narrador= narrador; 
        
        this.narrador.addLibro(this);
    }
    
}
