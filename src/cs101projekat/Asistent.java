/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs101projekat;

import Enum.Pol;
import Enum.Smer;
import Enum.VrstaNauke;

/**
 *
 * @author imvan
 */
public class Asistent extends Osoba{
    private String diploma;
    private Smer smer;
    private Pol pol;
    private VrstaNauke nauke;

    public Asistent() {
    }

    public Asistent(String diploma, Smer smer, Pol pol, VrstaNauke nauke, String ime, String prezime, int godiste) {
        super(ime, prezime, godiste);
        this.diploma = diploma;
        this.smer = smer;
        this.pol = pol;
        this.nauke = nauke;
    }
    
    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
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

    public VrstaNauke getNauke() {
        return nauke;
    }

    public void setNauke(VrstaNauke nauke) {
        this.nauke = nauke;
    }

    
    @Override
    public String toString() {
        return "Asistent{" + " Ime: " + super.getIme() + ", Prezime: " + super.getPrezime()+ ", Godiste: " + super.getGodiste() + ", Pol: " + pol  + ", Diploma: " + diploma + ", Smer: " + smer + '}';
    }
    
    
}
