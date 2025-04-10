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
public class Predispitneobaveze extends Ispit{
    private double kolokvijumi;
    private double projekat;
    private double semnarskirad;
    private double testovi;
    private double zadaci;
    private double aktivnost;
    double espb;
     double ukupno;

    public Predispitneobaveze() {
    }

    public Predispitneobaveze( double kolokvijumi, double projekat, double semnarskirad, double testovi, double zadaci, double aktivnost, double poeni) {
        super(poeni);
        this.kolokvijumi = kolokvijumi;
        this.projekat = projekat;
        this.semnarskirad = semnarskirad;
        this.testovi = testovi;
        this.zadaci = zadaci;
        this.aktivnost = aktivnost;
    }

    
   

    public double getKolokvijumi() {
        return kolokvijumi;
    }

    public void setKolokvijumi(double kolokvijumi) {
        this.kolokvijumi = kolokvijumi;
    }

    public double getProjekat() {
        return projekat;
    }

    public void setProjekat(double projekat) {
        this.projekat = projekat;
    }

    public double getSemnarskirad() {
        return semnarskirad;
    }

    public void setSemnarskirad(double semnarskirad) {
        this.semnarskirad = semnarskirad;
    }

    public double getTestovi() {
        return testovi;
    }

    public void setTestovi(double testovi) {
        this.testovi = testovi;
    }

    public double getZadaci() {
        return zadaci;
    }

    public void setZadaci(double zadaci) {
        this.zadaci = zadaci;
    }

    public double getAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(double aktivnost) {
        this.aktivnost = aktivnost;
    }
    
   

    public void racunajukupnoPoene(){
       
        
        ukupno = getKolokvijumi() + getAktivnost() + getPoeni() + getProjekat() + getSemnarskirad() + getTestovi() + getZadaci();
        
        
    }
    
    public double racunajPoenebeEspb(){
        
        
        espb = getKolokvijumi() + getAktivnost()  + getProjekat() + getSemnarskirad() + getTestovi() + getZadaci();
        return espb;
        
        
    }
    @Override
    public String toString() {
        return "Predispitneobaveze{" +  ", kolokvijumi=" + kolokvijumi + ", projekat=" + projekat + ", semnarskirad=" + semnarskirad + ", testovi=" + testovi + ", zadaci=" + zadaci + ", aktivnost=" + aktivnost + ", poeni=" + super.getPoeni() + '}';
    }

    

    
   
    
    
        
    
    }

    

    
    
    
