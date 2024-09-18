/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

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
    Editorial editorial = new Editorial();
    protected ArrayList<Autor> Autores; 
    
}
