package OOPS.polymorphism;

public class Circle extends Shapes{

//    this will run when the object of Circle
//    hence it is overriding the parent method
    @Override  //this is call annotation
    void area() {
        System.out.println("Are of circle is pi * r * r");
    }
}
