public class Main {
    public static void main(String args[]){
        Punto a = new Punto(1, 7, "A");
        Punto b = new Punto(4, 7, "B");
        Punto c = new Punto(4, 3, "C");
        Triangolo tr1 = new Triangolo(a, b, c);
        System.out.println("Il triangolo ha nome: " + tr1.getTrName());
        for(int i=0; i<3; i++){
            System.out.println("Il suo punto " + tr1.getPointName(i) + " ha X di coordinata: " + tr1.getPointX(i) + " e Y di coordinata: " + tr1.getPointY(i) + ".");
        }
        System.out.println("Il suo perimetro equivale a: " + tr1.perimetro());
        System.out.println("Area calcolata con Sarrus: " + tr1.areaSarrus());
        System.out.println("Area calcolata con Erone: " + tr1.areaErone());
    }
}