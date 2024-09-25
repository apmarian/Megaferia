/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.megaferia;

import Core.person.Gerente;
import core.book.Libro;
import java.util.ArrayList;

/**
 *
 * @author apmarian
 */
public class Editorial {

    private String nit;
    private String nombre;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, Gerente gerente, ArrayList<Libro> libros, ArrayList<Stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.gerente = gerente;
        this.libros = libros;
        this.stands = stands;
    }

    public boolean addLibro(Libro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }

    public boolean addStand(Stand stand) {
        if (!this.stands.contains(stand)) {
            this.stands.add(stand);
            return true;
        }
        return false;
    }

}
