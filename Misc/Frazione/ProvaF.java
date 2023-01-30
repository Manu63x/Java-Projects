public class ProvaF{
    public static void main(String args[]){
        Frazione a = new Frazione(3, 1);
        Frazione b = new Frazione(4, 2);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("Operazioni tra B e A\n\nSomma:\n" + b.piu(a));
        System.out.println("\nDifferenza:\n" + b.meno(a));
        System.out.println("\nMoltiplicazione:\n" + b.per(a));
        System.out.println("\nDivisione:\n" + b.diviso(a));
        if(a.isMaggiore(b)){
            System.out.println("La frazione a è maggiore di b");
        }else{
            System.out.println("La frazione b è maggiore o uguale ad a");
        }
        if(a.isMinore(b)){
            System.out.println("La frazione a è minore di b");
        }else{
            System.out.println("La frazione b è minore o uguale ad a");
        }
    }
}