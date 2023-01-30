public class GestoreLibri {
    //costruttore
    public GestoreLibri(){
        
    }
    public Libro getBMaxPG(Libro[] libri){
        int i=0;
        int max=0;
        int index=0;
        while(libri[i]!=null){
            if(libri[i].getNumPag()>max){
                max=libri[i].getNumPag();
                index=i;
            }
            i++;
        }
        return libri[index];
    }
    public static Libro[] getAuthB(String auth, Libro[] libri){
        int i=0;
        int j=0;
        Libro[] authlib = new Libro[libri.length+1];
        while(libri[i]!=null){
            if(libri[i].getAuth().equals(auth)){
                authlib[j]=libri[i];
                j++;
            }
            i++;
        }
        return authlib;
    }
    public static boolean findXTitleBool(String title, Libro[] libri){
        int i=0;
        while(libri[i]!=null){
            if(libri[i].getTitle().equals(title)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int getIndexOccurency(Libro[] libri,String title){
        int i=0;
        while(libri[i]!=null){
            if(libri[i].getTitle().equals(title)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static Libro getBookOccurency(String title, Libro[] libri){
        int i=0;
        while(libri[i]!=null){
            if(libri[i].getTitle().equals(title)){
                return libri[i];
            }
            i++;
        }
        return null;
    }
}
