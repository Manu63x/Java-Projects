public class Main{
    public static void main(String[] args){
        Libro[] libri = new Libro[3];
        Libro[] auth = new Libro[3];
        int i=0;
        libri[0]= new Libro("CiccioGamer", 150, "In Cucina Con Ciccio");
        libri[1]= new Libro("Prova", 140, "Libro di Prova");
        libri[2]= null;
        GestoreLibri a = new GestoreLibri();
        System.out.println("---------------------------------------------");
        System.out.println("Libro con il maggior numero di pagine: " + a.getBMaxPG(libri).getNumPag());
        System.out.println("---------------------------------------------");
        System.out.println("Libri nell'elenco: ");
        while(libri[i]!=null){
            System.out.println("" + libri[i].toString());
            i++;
        }
        System.out.println("---------------------------------------------");
        i=0;
        //getAuthB
        System.out.println("Libri di Ciccio Gamer: ");
        auth=GestoreLibri.getAuthB("CiccioGamer", libri);
        while(auth[i]!=null){
            System.out.println("" + auth[i].toString());
            i++;
        }
        System.out.println("---------------------------------------------");
        System.out.println("In Cucina Con Ciccio è presente? Risposta: " + GestoreLibri.findXTitleBool("In Cucina Con Ciccio", libri));
        System.out.println("Libro B è presente? Rsiposta: " + GestoreLibri.findXTitleBool("Libro B", libri));
        System.out.println("---------------------------------------------");
        if(GestoreLibri.getIndexOccurency(libri,"In Cucina Con Ciccio")==-1){
            System.out.println("Non presente.");
        }else{
            System.out.println("Nell'array dei libri il libro è alla posizione " + GestoreLibri.getIndexOccurency(libri,"In Cucina Con Ciccio"));
        }
        if(GestoreLibri.getIndexOccurency(libri,"Libro di Prova")==-1){
            System.out.println("Non presente.");
        }else{
            System.out.println("Nell'array dei libri il libro è alla posizione " + GestoreLibri.getIndexOccurency(libri,"Libro di Prova"));
        }
        if(GestoreLibri.getIndexOccurency(libri,"a")==-1){
            System.out.println("Non presente.");
        }else{
            System.out.println("Nell'array dei libri il libro è alla posizione " + GestoreLibri.getIndexOccurency(libri,"a"));
        }
        System.out.println("---------------------------------------------");
        //getBookOccurrency
        System.out.println("" + GestoreLibri.getBookOccurency("In Cucina Con Ciccio", libri).toString());
    }
}