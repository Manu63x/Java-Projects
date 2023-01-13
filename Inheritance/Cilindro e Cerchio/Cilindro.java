public class Cilindro extends Cerchio{
    double altezza;
    public Cilindro(double raggio, double altezza){
        super(raggio);
        this.altezza=altezza;
    }
    //getter
    public double getAltezza(){
        return altezza;
    }
    //setter
    public void setAltezza(double altezza){
        this.altezza=altezza;
    }
    //metodi
    public double volumeCilindro(){
        return areaCerchio()*altezza;
    }
    public double areaLaterale(){
        return circonferenza()*altezza;
    }
    public double areaSuperficie(){
        return areaLaterale()+2*areaCerchio();
    }
    @Override
    public String toString(){
        return super.toString() + "Altezza: " + altezza;
    }
}