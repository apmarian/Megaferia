/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.person;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public abstract class Persona {
    protected String nombre; 
    protected int cedula; 
    
    public Persona(String nombre, int cedula){
        this.nombre= nombre; 
        this.cedula= cedula;
    }
        
}
