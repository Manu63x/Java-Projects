import Persona.Student;

public class Test {
    public static void main(String[] args) {
        Person persona1= new Person("Mario", "Rossi", 2009);
        Student studente1= new Student("Gino", "Ginooooooo", 2005, 74);
        System.out.println(persona1.toString());
        System.out.println(studente1.toString());
    }
}
