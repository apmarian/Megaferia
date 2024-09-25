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
 * @author apmarian
 */
public abstract class Libro {
    protected String titulo; 
    protected String isbn; 
    protected String genero; 
    protected String formato; 
    protected float valor; 
    protected Editorial editorial; 
    protected ArrayList<Autor> Autores; 
    
    public Libro (String titulo, ArrayList<Autor> Autores, String isbn, String genero, String formato, float valor, Editorial editorial ){
        
        this.titulo= titulo; 
        this.Autores= Autores;
        this.isbn= isbn;
        this.genero=genero;
        this.formato= formato;
        this.valor= valor; 
        this.editorial= editorial; 
        
        
        for(Autor autor: this.Autores){
            autor.addLibro(this);            
        }
        this.editorial.addLibro(this);
        
    }
}
