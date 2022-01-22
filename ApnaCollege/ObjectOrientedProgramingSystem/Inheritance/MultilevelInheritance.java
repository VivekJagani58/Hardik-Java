package Inheritance;
class Shape {                                               //Base class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {                              //Derived class(Sub class)
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
}
class EquilateralTriangle extends Triangle {                //Derived class(Sub class)
    int side;
}                                                                         /*/ Multi Level Inheritance /*/
 

public class MultilevelInheritance {
    public static void main(String[] args) {
        
    }
}
