/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs101projekat;


import Enum.Pol;
import Enum.Smer;

/**
 *
 * @author imvan
 */
public class Student extends Osoba{
    private int brindeksa;
    private Smer smer;
    private Pol pol;

    public Student() {
    }

    public Student(int brindeksa, Smer smer, Pol pol,  String ime, String prezime, int godiste) {
        super(ime, prezime, godiste);
        this.brindeksa = brindeksa;
        this.smer = smer;
        this.pol = pol;
    }

    public int getBrindeksa() {
        return brindeksa;
    }

    public void setBrindeksa(int brindeksa) {
        this.brindeksa = brindeksa;
    }



    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }
    


    @Override
    public String toString() {
        System.out.println("Student: ");
        return super.toString() + " Broj indeksa: " + brindeksa + ", Smer: " + smer + '}';
    }

    void setPol(String pol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSmer(String smer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
