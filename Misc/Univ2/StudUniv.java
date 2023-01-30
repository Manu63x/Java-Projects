import java.util.Vector;

public class StudUniv{
    private String nome;
    private String cognome;
    private int eta;
    private int crediti;
    private int id;
    private final int aaiscr; //anno iscrizione
    Vector <String> corsi = new Vector<String>();
    //costruttori
    public StudUniv(String nome, String cognome, int eta, int id, int aaiscr){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.aaiscr=aaiscr;
        this.id=id;
        crediti=0;
        corsi.add(null);
    }
    //getter
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getEta(){
        return eta;
    }
    public int getCrediti(){
        return crediti;
    }
    public int getID(){
        return id;
    }
    public int getaaIscr(){
        return aaiscr;
    }
    //setter
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setEta(int eta){
        this.eta=eta;
    }
    public void setCrediti(int crediti){
        this.crediti=crediti;
    }
    public void setID(int id){
        this.id=id;
    }
    //metodi
    public void iscrizione(String corso){
        corsi.add(0,corso);;
    }
    public void remIscr(String corso){
        int i=0;
        while(corsi.get(i)!=null){
            if(corsi.get(i).equals(corso)){
                corsi.remove(i);
            }
            i++;
        }
    }
    public String toString(){
        return "Nome: " + nome + ", Cognome: " + cognome +", Età: " + eta +", Crediti Universitari: " + crediti + ", ID studente: " + id + ", Anno iscrizione: " + aaiscr;
    }
    public void viewCorsi(){
        int i=0;
        while(corsi.get(i)!=null){
            System.out.println("" + corsi.get(i));
            i++;
        }
    }
}