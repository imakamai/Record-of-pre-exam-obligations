/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs101projekat;

/**
 *
 * @author imvan
 */
public class Ispit {
    private double poeni;

    public Ispit() {
    }

    public Ispit(double poeni) {
        this.poeni = poeni;
    }

    public double getPoeni() {
        return poeni;
    }

    public void setPoenisaispita(double poeni) {
        this.poeni = poeni;
    }

    @Override
    public String toString() {
        return "{" + " Poeni sa ispita: " + poeni + '}';
    }
    
    
}
