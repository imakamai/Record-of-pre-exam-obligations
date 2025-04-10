/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs101projekat;

import Enum.Pol;
import Enum.Smer;
import Enum.VrstaNauke;
import Util.Utils;
import java.util.Scanner;


/**
 *
 * @author imvan
 */
public class MainProjekat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asistent as1 = new Asistent("Master diploma iz engleskog", Smer.INFORMACIONETEHNOLOGIJE, Pol.MUSKI, VrstaNauke.ENGLESKI, "Sasa", "Jotic", 1980);
        Asistent as2 = new Asistent("Master diploma iz matematike", Smer.SOFTERSKOINZINJERSTVO,  Pol.MUSKI, VrstaNauke.MATEMATIKA, "Dusan", "Cvetovic", 1991);  
        Asistent as3 = new Asistent("Master diploma iz uvoda u objektno-orijentisano programiranje", Smer.RACUNARSKEIGRE , Pol.ZENSKI, VrstaNauke.CS101, "Ema", "Joickovic", 1990);
        Asistent as4 = new Asistent("Master diploma iz IT101 Osnove informacionih tehnologija", Smer.SOFTERSKOINZINJERSTVO , Pol.ZENSKI, VrstaNauke.IT101, "Tanja", "Taric", 1989);
        Predmet cs101 = new Predmet(VrstaNauke.CS101, 0, 27, 0, 6, 20, 10, 16);
        Predmet it101 = new Predmet(VrstaNauke.IT101, 0, 25, 0, 10, 18, 10, 25);
        Predmet ma101 = new Predmet(VrstaNauke.MATEMATIKA,20, 0, 0, 0, 26, 8, 23);
        Predmet nt111 = new Predmet(VrstaNauke.ENGLESKI, 20, 10, 14, 5, 6.5, 10, 26);
        
        
        /*Unos informacija preko konzole*/
        Scanner sc = new Scanner (System.in);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("PROGRAM ZA EVIDENCIJU PREDISPITNIH OBAVEZA");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Unesite podatke studenta.");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Ime studenta:"); 
        Student st =  new Student();
        String ime = sc.next();
        st.setIme(ime);
        if (Utils.sadrziSamoSlova(ime) == true) {
                        st.setIme(ime);
                    } else {
                        while (Utils.sadrziSamoSlova(ime) == false) {
                            System.out.println(" ");
                            System.out.println("Samo Slova");
                            ime = sc.next();
                            if (Utils.sadrziSamoSlova(ime) == true) {
                                st.setIme(ime);
                                break;
                            }
                        }
                    }
        System.out.println("Prezime studenta:");
        String prezime = sc.next();
        st.setPrezime(prezime);
        if (Utils.sadrziSamoSlova(prezime) == true) {
                        st.setPrezime(prezime);
                    } else {
                        while (Utils.sadrziSamoSlova(prezime) == false) {
                            System.out.println(" ");
                            System.out.println("Samo Slova");
                            prezime = sc.next();
                            if (Utils.sadrziSamoSlova(prezime) == true) {
                                st.setPrezime(prezime);
                                break;
                            }
                        }
                    }
        System.out.println("Pol: M/Z");
        String pol = sc.next();
        System.out.println("Godiste studenta:");
        int godiste = sc.nextInt();
        st.setGodiste(godiste);
        System.out.println("Smer na kome je student Racuanrskeigre,Softerskoinzinjerstvo,Informacionetehnologije:");
        String smer = sc.next();
        System.out.println("Broj indeksa studenta:");
        int brindeksa = sc.nextInt();
        st.setBrindeksa(brindeksa);
        
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Predmeti koji student pohadja MA101, CS101, IT100 i NT111");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Za MA101 ima kolokvijum, zadatke i zalaganje.");
        System.out.println("Za CS101 ima testove, zadatke, projekat i zalaganje.");
        System.out.println("Za IT101 ima testove, zadatke, projekat i zalaganje.");
        System.out.println("Za NT111 ima kolokvijum, test, projeka, zadatke, seminarski rad i zalaganje. ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        /*Unose se poeni sa domacih zadataka, projekta, testova i zalaganja iz CS101*/
        System.out.println("CS101 predmet:");
        System.out.println("Unesi broj poena sa  CS101 domacih zadataka:");
        double cszadaci = sc.nextDouble();
        cs101.setZadaci(cszadaci);
        System.out.println("Unesi broj poena sa CS101 projekat:");
        double csprojekat = sc.nextDouble();
        cs101.setProjekat(csprojekat);
        System.out.println("Unesi broj poena sa CS101 testove:");
        double cstestovi = sc.nextDouble();
        cs101.setTestovi(cstestovi);
        System.out.println("Unesi broj poena zalaganja iz CS101:");
        double csaktivnost = sc.nextDouble();
        cs101.setAktivnost(csaktivnost);
        
        /*Provera da li student ima uslova da izadje na ispit iz CS101*/
        System.out.println("Izracunavanje ESPB bodova:");
        double espbcs = csaktivnost + cstestovi + csprojekat + cszadaci;
        System.out.println(espbcs);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Da li student ima pravo da izadje na ispi?");
        if (espbcs >= 35) {
            System.out.println("Imate pravo da izadjete na ispit!");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Ispitni poeni:");
        double csispitp = sc.nextDouble();
        cs101.setPoenisaispita(csispitp);
        
        /*Ukupan broj poena sa ispita i predispitne obaveze*/
        double csukupno = csispitp + espbcs;
        System.out.println("Ukupan broj poena");
        System.out.println(csukupno);
        
        /*Ocena*/
        if(csukupno>90 && csukupno<=100){
            System.out.println("Dobili ste ocenu 10!");
        }
        else if(csukupno>80 && csukupno<=90){
            System.out.println("Dobili ste ocenu 9!");
        }
        else if(csukupno>70 && csukupno<=80){
            System.out.println("Dobili ste ocenu 8!");
        }
        else if(csukupno>60 && csukupno<=70){
            System.out.println("Dobili ste ocenu 7!");
        }
        else if(csukupno>50 && csukupno<=60){
            System.out.println("Dobili ste ocenu 6!");
        }
        else{
            System.out.println("Zao nam je, niste polozili ispit!");
        }
        } else {
            System.out.println("Zao mi je, ne mozete da izadjete na ispit!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        /*Unose se poeni sa domacih zadataka, projekta, testova i zalaganja iz IT101*/
        System.out.println("IT101 predmet:");
        System.out.println("Unesi broj poena sa  IT101 domacih zadataka:");
        double itzadaci = sc.nextDouble();
        it101.setZadaci(itzadaci);
        System.out.println("Unesi broj poena sa IT101 projekat:");
        double itprojekat = sc.nextDouble();
        it101.setProjekat(itprojekat);
        System.out.println("Unesi broj poena sa IT101 testovE:");
        double ittestovi = sc.nextDouble();
        it101.setTestovi(ittestovi);
        System.out.println("Unesi broj poena zalaganja iz IT101:");
        double itaktivnost = sc.nextDouble();
        it101.setAktivnost(itaktivnost);
        
        /*Provera da li student ima uslova da izadje na ispit iz IT101*/
         System.out.println("Izracunavanje ESPB bodova:");
        double espbit = itaktivnost + ittestovi + itprojekat + itzadaci;
        System.out.println(espbit);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Da li student ima pravo da izadje na ispi?");
        if (espbit >= 35) {
            System.out.println("Imate pravo da izadjete na ispit!");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Ispitni poeni:");
        double itispitp = sc.nextDouble();
        cs101.setPoenisaispita(itispitp);
        
        /*Ukupan broj poena sa ispita i predispitne obaveze*/
        double itukupno = itispitp + espbit;
        System.out.println("Ukupan broj poena");
        System.out.println(itukupno);
        
        /*Ocena*/
        if(itukupno>90 && itukupno<=100){
            System.out.println("Dobili ste ocenu 10!");
        }
        else if(itukupno>80 && itukupno<=90){
            System.out.println("Dobili ste ocenu 9!");
        }
        else if(itukupno>70 && itukupno<=80){
            System.out.println("Dobili ste ocenu 8!");
        }
        else if(itukupno>60 && itukupno<=70){
            System.out.println("Dobili ste ocenu 7!");
        }
        else if(itukupno>50 && itukupno<=60){
            System.out.println("Dobili ste ocenu 6!");
        }
        else{
            System.out.println("Zao nam je, niste polozili ispit!");
        }
        } else {
            System.out.println("Zao mi je, ne mozete da izadjete na ispit!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        /*Unose se poeni sa domacih zadataka, kolokvijumima i zalaganja iz MA101*/
        System.out.println("MA101 predmet:");
        System.out.println("Unesi broj poena sa  MA101 domacih zadataka:");
        double mazadaci = sc.nextDouble();
        ma101.setZadaci(mazadaci);
        System.out.println("Unesi broj poena sa MA101 kolokvijuma:");
        double makolokvijum = sc.nextDouble();
        ma101.setKolokvijumi(makolokvijum);
        System.out.println("Unesi broj poena zalaganja iz MA101:");
        double maaktivnost = sc.nextDouble();
        ma101.setAktivnost(maaktivnost);
        
        /*Provera da li student ima uslova da izadje na ispit iz MA101*/
         System.out.println("Izracunavanje ESPB bodova:");
        double espbma = maaktivnost +  mazadaci + makolokvijum;
        System.out.println(espbma);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Da li student ima pravo da izadje na ispi?");
        if (espbma >= 35) {
            System.out.println("Imate pravo da izadjete na ispit!");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Ispitni poeni:");
        double maispitp = sc.nextDouble();
        cs101.setPoenisaispita(maispitp);
        
        /*Ukupan broj poena sa ispita i predispitne obaveze*/
        double maukupno = maispitp + espbma;
        System.out.println("Ukupan broj poena");
        System.out.println(maukupno);
        
        /*Ocena*/
        if(maukupno>90 && maukupno<=100){
            System.out.println("Dobili ste ocenu 10!");
        }
        else if(maukupno>80 && maukupno<=90){
            System.out.println("Dobili ste ocenu 9!");
        }
        else if(maukupno>70 && maukupno<=80){
            System.out.println("Dobili ste ocenu 8!");
        }
        else if(maukupno>60 && maukupno<=70){
            System.out.println("Dobili ste ocenu 7!");
        }
        else if(maukupno>50 && maukupno<=60){
            System.out.println("Dobili ste ocenu 6!");
        }
        else{
            System.out.println("Zao nam je, niste polozili ispit!");
        }
        } else {
            System.out.println("Zao mi je, ne mozete da izadjete na ispit!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        /*Unose se poeni sa domacih zadataka, seminarskog rada, kolokvijuma, projekta, testova i zalaganja iz CS101*/
        System.out.println("NT111 predmet:");
        System.out.println("Unesi broj poena sa  NT111 domacih zadataka:");
        double ntzadaci = sc.nextDouble();
        nt111.setZadaci(ntzadaci);
        System.out.println("Unesi broj poena sa NT111 kolokvijuma:");
        double ntkolokvijum = sc.nextDouble();
        nt111.setKolokvijumi(ntkolokvijum);
        System.out.println("Unesi broj poena sa NT111 projekat:");
        double ntprojekat = sc.nextDouble();
        nt111.setProjekat(ntprojekat);
        System.out.println("Unesi broj poena sa NT111 seminarskog rada:");
        double ntseminarskirad = sc.nextDouble();
        nt111.setSemnarskirad(ntseminarskirad);
        System.out.println("Unesi broj poena sa NT111 testova:");
        double nttestovi = sc.nextDouble();
        nt111.setTestovi(nttestovi);
        System.out.println("Unesi broj poena zalaganja iz NT111:");
        double ntaktivnost = sc.nextDouble();
        nt111.setAktivnost(ntaktivnost);
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        /*Provera da li student ima uslova da izadje na ispit iz  NT111*/
         System.out.println("Izracunavanje ESPB bodova:");
        double espbnt = ntaktivnost + nttestovi + ntprojekat + ntzadaci + ntseminarskirad + ntkolokvijum;
        System.out.println(espbnt);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Da li student ima pravo da izadje na ispi?");
        if (espbnt >= 35) {
            System.out.println("Imate pravo da izadjete na ispit!");
            System.out.println("Ispitni poeni:");
        double ntispitp = sc.nextDouble();
        cs101.setPoenisaispita(ntispitp);
        
        /*Ukupan broj poena sa ispita i predispitne obaveze*/
        double ntukupno = ntispitp + espbnt;
        System.out.println("Ukupan broj poena");
        System.out.println(ntukupno);
        
        /*Ocena*/
        if(ntukupno>90 && ntukupno<=100){
            System.out.println("Dobili ste ocenu 10!");
        }
        else if(ntukupno>80 && ntukupno<=90){
            System.out.println("Dobili ste ocenu 9!");
        }
        else if(ntukupno>70 && ntukupno<=80){
            System.out.println("Dobili ste ocenu 8!");
        }
        else if(ntukupno>60 && ntukupno<=70){
            System.out.println("Dobili ste ocenu 7!");
        }
        else if(ntukupno>50 && ntukupno<=60){
            System.out.println("Dobili ste ocenu 6!");
        }
        else{
            System.out.println("Zao nam je, niste polozili ispit!");
        }
        } else {
            System.out.println("Zao mi je, ne mozete da izadjete na ispit!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        
        /*Stampanje asistenata*/
        System.out.println(as1);
        System.out.println(as2);
        System.out.println(as3);
        System.out.println(as4);
        }
    
         
        
        
    
}
        
        
        

      
    

