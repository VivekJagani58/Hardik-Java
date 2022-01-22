package Inheritance;

class Shape {                                           //base class
    public void area() {                                     
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {                          //Derived class(Sub class)
    public void area(int l, int h) {
        System.out.println((1/2)*l*h);
    }   
}                                                                           /*/ Single Level Inheritance /*/
 

public class SingleLevelInheritance {
    public static void main(String[] args) {

    }
}
