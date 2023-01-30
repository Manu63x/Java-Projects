public class ArrayF{
    public static void main(String[] args){
        Frazione[] af = new Frazione[5];
        af[0].setNumeratore(5);
        af[0].setDenominatore(4);
        af[1].setNumeratore(3);
        af[1].setDenominatore(2);
        af[2].setNumeratore(6);
        af[2].setDenominatore(3);
        af[3].setNumeratore(8);
        af[3].setDenominatore(9);
        af[4].setNumeratore(1);
        af[4].setDenominatore(5);
        for(int i=0;i<5;i++){
            System.out.println("\n");
            af[i].toString();
        }
    }
}