import java.util.Vector;

public class Poligono{
    public static void main(String args[]){
        Vector <Punto> punti = new Vector <Punto>(3,1);
        punti.add(new Punto(1,0,"A"));
        punti.add(new Punto(2,10,"B"));
        System.out.println(punti.firstElement().toString());
        System.out.println(punti.lastElement().toString());
        System.out.println(punti.size());
    }
}