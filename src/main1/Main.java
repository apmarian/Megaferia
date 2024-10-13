/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

import Core.megaferia.Editorial;
import Core.megaferia.Megaferia;
import Core.person.Autor;
import Core.person.Gerente;
import java.util.ArrayList;

/**
 *
 * @author apmarian
 */
public class Main {

    public static void main(String[] args) {
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
        Editorial editorial1 = new Editorial("891-88887777-1", "Planeta", "Calle 45 #43-51", gerente1);
        Editorial editorial2 = new Editorial("999-44556688-2", "Penguin Random House", "Calle 5 #7-52", gerente2);

        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(2);
        standsIds.add(3);
        
        ArrayList<Editorial> editoriales = new ArrayList();
        editoriales.add(editorial1);
        editoriales.add(editorial2);

        Autor autor1 = null;
        megaferia.assignStandEditorial(standsIds, editoriales);
        
        System.out.println(megaferia + " -> " + megaferia.getStands());
        System.out.println(megaferia + " -> " + megaferia.getEditoriales() + "\n");
        
        System.out.println(gerente1 + " -> " + gerente1.getEditorial());
        System.out.println(gerente2 + " -> " + gerente2.getEditorial() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getGerente());
        System.out.println(editorial2 + " -> " + editorial2.getGerente() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getStands());
        System.out.println(editorial2 + " -> " + editorial2.getStands() + "\n");      
        
        megaferia.verifyStands();

    }

}
