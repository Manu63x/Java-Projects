package Persona;
public class Student extends Person{
    int matricola;
    public Student(String firstName, String lastName, int yob, int matricola){
        super(firstName, lastName, yob);
        this.matricola=matricola;
    }
    public void setMatricola(int matricola){
        this.matricola=matricola;
    }
    public int getMatricola(){
        return matricola;
    }
    @Override
    public String toString(){
        String res;
        res=super.toString();
        res+= ", Matricola: " + matricola;
        return res;
    }
}
