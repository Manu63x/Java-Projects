import java.util.Vector;
import java.util.Calendar;

public class Corso {
    String nomeCorso;
    String titolare;
    int creditiCorso;
    String settore;
    int maxstud;
    Vector <StudUniv> studenti;
    Calendar calendario = Calendar.getInstance();
    //costruttori
    public Corso(String nomeCorso, String titolare, int creditiCorso, String settore, int maxstud){
        this.nomeCorso=nomeCorso;
        this.titolare=titolare;
        this.creditiCorso=creditiCorso;
        this.settore=settore;
        this.maxstud=maxstud;
        studenti=new Vector<StudUniv>();
        studenti.add(null);
    }
    //getter
    public String getNomeCorso(){
        return nomeCorso;
    }
    public String getTitolare(){
        return titolare;
    }
    public int getCreditiCorso(){
        return creditiCorso;
    }
    public String getSettore(){
        return settore;
    }
    public int getMaxStud(){
        return maxstud;
    }
    //metodi
    public void insertStud(StudUniv studente){
        if(studenti.size()-1<maxstud){
            studenti.add(0, studente);
        }
        return;
    }
    /*
    public void elencoMatricole(){
        int i=0;
        while(studenti.get(i)!=null){
            System.out.println(""+studenti.get(i).toString());
            i++;
        }
        return;
    }
    */
    //public Vector<StudUniv> elencoMatricole(){
        
    //}

    public void iscrizione2( int aaiscr, StudUniv a){
        if((calendario.get(Calendar.YEAR)-aaiscr)>=2){
            insertStud(a);
        }
    }

    public Vector<StudUniv> nAnni(int anni){
        int i=0;
        Vector <StudUniv> vect= new Vector<StudUniv>();
        while(studenti.elementAt(i)!=null){
            if((calendario.get(Calendar.YEAR)-studenti.elementAt(i).getaaIscr())==anni){
                vect.add(studenti.elementAt(i));
            }
            i++;
        }
        return vect;
    }
    
    public Vector<StudUniv> matricolaK(int k){
        int i=0;
        Vector <StudUniv> elenco= new Vector<StudUniv>(1);
        elenco.set(0,null);
        while(studenti.get(i).getID()!=k){
            i++;
        }
        while(studenti.get(i)!=null){
            elenco.add(0,studenti.get(i));
            i++;
        }
        return elenco;
    }
    
    public boolean exist(String nomeToS, String cognomeToS){
        int i=0;
        while(studenti.get(i)!=null){
            if(studenti.get(i).getNome().equals(nomeToS) && studenti.get(i).getCognome().equals(cognomeToS)){
                return true;
            }
            i++;
        }
        return false;
    }

    public String toString(){
        return "Nome corso: " + nomeCorso + ", Titolare corso: " + titolare + ", Crediti corso: " + creditiCorso + ", Settore: " + settore + ", Studenti massimi: " + maxstud + ", Studenti iscritti: " + (studenti.size()-1);
    }

}