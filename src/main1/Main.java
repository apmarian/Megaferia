/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

import Core.megaferia.Editorial;
import Core.megaferia.Megaferia;
import Core.person.Gerente;
import java.util.ArrayList;

/**
 *
 * @author apmarian
 */
public class Main {
     
    public static void main(String [] args){
        Megaferia megaferia = new Megaferia();
        
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        megaferia.createStand(500000);
        
        megaferia.verifyStands();

        //crear gerente 1 y 2
        Gerente gerente1 = new Gerente("Marian", 12345);
        Gerente gerente2 = new Gerente("Andrea", 23456);

        //crear editorial        

        
        ArrayList<Integer> standsIds= new ArrayList<>();
       standsIds.add(0);
      
    }
        
}
