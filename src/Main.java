public interface Main {
    public enum CupSize{
        S,M,L,XL
    }
    public static void main(String[] args) {
        String[] cocktailNames = {"Milc","bvery","Choco","Exotic"};
        double[] cocktailsPrise = {4.6,3.7,7.7,6};
        CupSize[] cupSizes = {CupSize.S,CupSize.M,CupSize.L,CupSize.XL,};
        printMenu(cocktailNames,cocktailsPrise,cupSizes);

    }
    static void printLine(String name, double prise, CupSize size){
        String pattern =  "| %-20s - %-3S$ %3s |";
        String line = String.format(pattern, name , prise, size);
        System.out.println(line);
    }
    static void  printMenu(String [] name, double[] price, CupSize[] cupSizes ){
        for (int i = 0; i < name.length ; i++) {
            printLine(name[i],price[i],cupSizes[i]);
        }
    }
}
