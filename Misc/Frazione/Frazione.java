public class Frazione {
    //attributi
    private int x;  //numeratore
    private int y; //denominatore
    //costruttori
    public Frazione(int x, int y){
        if(y==0){
            return;
        }else{
            if(x%y==0){ // semplificazione
                x=x/y;
                y=y/y;
            }
            this.x=x;
            this.y=y;
        }
    }
    public Frazione(int x){
        this(x,1);
    }
    //metodi
    public Frazione diviso(Frazione f){
        Frazione a = new Frazione(1,1);
        a.setDenominatore(x * f.getDenominatore());
        a.setNumeratore(y * f.getNumeratore());
        return a;
    }

    public boolean equals(Frazione f){
        if(x/y == f.getNumeratore()/f.getDenominatore()){
            return true;
        }else{
            return false;
        }
    }

    public int getNumeratore(){
        return x;
    }
    public int getDenominatore(){
        return y;
    }
    public void setNumeratore(int x){
        this.x=x;
    }
    public void setDenominatore(int y){
        this.y=y;
    }

    public boolean isMaggiore(Frazione f){
        if((x/y) > (f.getNumeratore()/f.getDenominatore())){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isMinore(Frazione f){
        if((x/y) < (f.getNumeratore()/f.getDenominatore())){
            return true;
        }else{
            return false;
        }
    }

    public Frazione meno(Frazione f){
        Frazione a = new Frazione(1, 1);
        a.setNumeratore(x * f.getDenominatore() - y * f.getNumeratore());
        a.setDenominatore(y * f.getDenominatore());
        return a;
    }

    public Frazione per(Frazione f){
        Frazione a = new Frazione(1,1);
        a.setNumeratore(x * f.getNumeratore());
        a.setDenominatore(y * f.getDenominatore());
        return a;
    }

    public Frazione piu(Frazione f){
        Frazione a = new Frazione(1,1);
        if(y == f.getDenominatore()){ //denominatore uguale
            a.setNumeratore(x + f.getNumeratore());
            a.setDenominatore(y);
        }else{ //denominatore diverso
            a.setNumeratore(x * f.getDenominatore() + y * f.getNumeratore());
            a.setDenominatore(y * f.getDenominatore());
        }
        return a;
    }

    public String toString(){
        if(y==1){
            return "" + x;
        }else{
            return x + "\n-\n" + y;
        }
    }
}
