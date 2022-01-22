package ObjectOrientedProgramingSystem;

class Student {
    static String school;            //static use key word
    String name;   
}
  
public class StaticKeyWord {
    public static void main(String args[]) {
        Student.school = "JMV";      //static calling directly
        Student s1 = new Student();  //objecte calling
        Student s2 = new Student();  //objecte calling
  
        s1.name = "Meena";
        s2.name = "Beena";
  
        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}
