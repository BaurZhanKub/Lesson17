package com.company;
public class  Main {

    public static void main(String[] args) {
        Coctail[] coctails = {
                Coctail.makeCoctail("Milc",4.6,CupSize.XL),
                Coctail.makeCoctail("bvery",3.7,CupSize.S),
                Coctail.makeCoctail("Choco",7.7,CupSize.M),
                Coctail.makeCoctail("Exotic",6,CupSize.L)
        };
        printMenu(coctails);
    }
    static void printLine(Coctail coctail){
        String pattern =  "| %-20s - %-3S$ %3s |";
        String line = String.format(pattern, coctail.name , coctail.prise, coctail.cupSize);
        System.out.println(line);
    }
    static void  printMenu(Coctail [] coctails ){
        for (Coctail cocktail:coctails) {
            printLine(cocktail);
        }
    }
}
