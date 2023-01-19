public interface Main {
    public static void main(String[] args) {
        String[] cocktailNames = {"Milc","bvery","Choco","Exotic"};
        double[] cocktailsPrise = {4.6,3.7,7.7,6};
        printMenu(cocktailNames,cocktailsPrise);

    }
    static void printLine(String name, double prise){
        String pattern =  "| %-20s - %-3S$";
        String line = String.format(pattern, name , prise);
        System.out.println(line);
    }
    static void  printMenu(String [] name, double[] price){
        for (int i = 0; i < name.length ; i++) {
            printLine(name[i],price[i]);
        }
    }
}
