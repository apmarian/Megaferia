/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.person;

import core.book.Audiolibro;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Narrador extends Persona{
    
    private ArrayList<Audiolibro> libros; 

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
    }
    
    public boolean addLibro(Audiolibro libro){
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false; 
    }
    
}
