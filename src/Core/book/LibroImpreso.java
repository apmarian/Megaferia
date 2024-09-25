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
public class LibroImpreso extends Libro {
    
    private int paginas;
    private int numEjemplares; 

    public LibroImpreso(int paginas, int numEjemplares, String titulo, ArrayList<Autor> Autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, Autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }
    
    
}
