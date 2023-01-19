package com.company;
public class Coctail {
    String name;
    double prise;
    CupSize cupSize;
    static Coctail makeCoctail(String name, double prise,CupSize cupSize){
        Coctail coctail = new Coctail();
        coctail.name = name;
        coctail.prise = prise;
        coctail.cupSize = cupSize;
        return coctail;
    }
}
