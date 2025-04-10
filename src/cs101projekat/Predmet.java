/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs101projekat;

import Enum.VrstaNauke;



/**
 *
 * @author imvan
 */
public class Predmet extends Predispitneobaveze{

    private VrstaNauke nauka;
        
    public Predmet() {
    }
    
    public Predmet(VrstaNauke nauka, double kolokvijumi, double projekat, double semnarskirad, double testovi, double zadaci, double aktivnost, double poeni) {
        super(kolokvijumi, projekat, semnarskirad, testovi, zadaci, aktivnost, poeni);
        this.nauka = nauka;
    }

    public VrstaNauke getNauka() {
        return nauka;
    }

    public void setNauka(VrstaNauke nauka) {
        this.nauka = nauka;
    }

    @Override
    public String toString() {
        return "Predmet{" + "nauka=" + nauka + '}';
    }

    
    
    

    

    

   }
    
    
  
  

