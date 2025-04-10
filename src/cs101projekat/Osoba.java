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
public abstract class Osoba {
    private String ime;
    private String prezime;
    private int godiste;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, int godiste) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    

    @Override
    public String toString() {
        return "Osoba{" + " Ime: " + ime + ", Prezime: " + prezime + ", Godiste: " + godiste +  '}';
    }
}
