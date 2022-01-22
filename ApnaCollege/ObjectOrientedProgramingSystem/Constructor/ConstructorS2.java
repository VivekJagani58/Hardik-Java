package JAVA.ApnaCollege.ObjectOrientedProgramingSystem.Constructor;

class bottel {
    String type;
    int rupees;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.rupees);
    }
    bottel(String type,int rupees) { /*/parameterize constructor/*/
    // ("constructor is method");
       this.type = type;
       this.rupees = rupees; 
    }
}
public class ConstructorS2 {

    public static void main(String[] args) {
        bottel b1 = new bottel("steel",549);//calling
        b1.prin();//calling
    }    
}
