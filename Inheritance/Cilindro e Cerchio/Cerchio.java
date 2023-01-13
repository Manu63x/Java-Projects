public class Cerchio {
    double raggio;
    //costruttori
    public Cerchio(double raggio){
        this.raggio=raggio;
    }
    //getter
    public double getRaggio(){
        return raggio;
    }
    //setter
    public void setRaggio(double raggio){
        this.raggio=raggio;
    }
    //metodi
    public double circonferenza(){
        return (raggio*2)*Math.PI;
    }
    public double areaCerchio(){
        return Math.pow(raggio, 2)*Math.PI;
    }
    public double diametro(){
        return raggio*2;
    }
    public String toString(){
        return "Raggio: " + raggio;
    }
}
