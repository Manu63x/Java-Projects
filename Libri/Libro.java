public class Libro {
    private String auth;
    private int numpag;
    private String title;
    //costruttori
    public Libro(String auth, int numpag, String title){
        this.auth=auth;
        this.numpag=numpag;
        this.title=title;
    }
    public Libro(){
        auth="";
        numpag=0;
        title="";
    }
    //getter
    public String getAuth(){
        return auth;
    }
    public int getNumPag(){
        return numpag;
    }
    public String getTitle(){
        return title;
    }
    //setter
    public void setAuth(String auth){
        this.auth=auth;
    }
    public void setNumPag(int numpag){
        this.numpag=numpag;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String toString(){
        return "" + getTitle() + ", " + getAuth() + ", " + getNumPag();
    }
}
