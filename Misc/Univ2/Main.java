public class Main {
    public static void main(String[] args) {
        Corso corsi = new Corso("Fondamenti di Informatica", "Paolo Rossi", 3, "IT", 200); // dati generici
        corsi.iscrizione2(2018, new StudUniv("Mario", "Bianchi", 23, 0, 2018));
        if(corsi.exist("Mario", "Bianchi")){
            System.out.println("Presente");
        }else{
            System.out.println("Non presente");
        }
        System.out.println(corsi.toString());
        System.out.println(corsi.nAnni(5).toString());
    }
}
