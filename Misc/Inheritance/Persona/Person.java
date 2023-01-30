import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person{
    String firstName;
    String lastName;
    int yob;
    //costruttori
    public Person(String firstName, String lastName, int yob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.yob=yob;
    }
    //getter
    public String getfName(){
        return firstName;
    }
    public String getlName(){
        return firstName;
    }
    public int getYOB(){
        return yob;
    }
    //setter
    public void setfName(String firstName){
        this.firstName=firstName;
    }
    public void setlName(String lastName){
        this.lastName=lastName;
    }
    public void setYOB(int yob){
        this.yob=yob;
    }
    //metodi
    public int calculateAge(){
        Calendar calendar;
        calendar= GregorianCalendar.getInstance();
        int curryear=calendar.get(Calendar.YEAR);
        return curryear-yob;
    }
    public String toString(){
        return "Nome: " + firstName + ", Cognome: " + lastName + ", Anno di nascita: " + yob;
    }
}