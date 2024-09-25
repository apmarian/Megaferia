/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.megaferia;

import java.util.ArrayList;

/**
 *
 * @author apmarian
 */
public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Megaferia{" + '}';
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void createStand(float precio) {
        //crea stands a megaferia
        this.stands.add(new Stand(precio));

    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand);
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    // metodo para asignar a un stand una editorial
    public void assignStandEditorial(ArrayList<Integer> standsIDs, ArrayList<Editorial> editoriales) {

        for (Editorial editorial : editoriales) {
            this.addEditorial(editorial); //recorro cada editorial
            for (Integer standId : standsIDs) {
                Stand stand = this.getStandById(standId);
                if (stand != null) {
                    // establecer relacion bidireccional, ejecutando los metodos. 
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                    
                }
            }
        }
    }

    private Stand getStandById(int standId) {
        for (Stand stand : this.stands) {
            if (stand.getId() == standId) {
                return stand;
            }
        }
        return null;
    }
}
