package Inheritance;

class Shape {                                           //Base Class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {                          //extend ,Derived class(Sub class)
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
}
class Circle extends Shape {                            //extend ,Derived class(Sub class)
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}   
class Pyramid extends Triangle {                         //extend ,Derived class(Sub class)         <-
    public void area(int h, int b) {
        System.out.println((1/2)*h*b);
        System.out.println((1/2)*h*b);
    }  
}                                                               /*/Hybrid  Level Inheritance /*/

public class HybridLevelInheritance {
    public static void main(String[] args) {
        
    }
}
