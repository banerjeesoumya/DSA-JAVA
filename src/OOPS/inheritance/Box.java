package OOPS.inheritance;

public class Box {
    double l;
    double h;
    double w;

    public Box(double l, double h, double w) {
//            System.out.println("Box Class Constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }



    static void greeting() {
        System.out.println("Hey I am in Box Class. Greeting!!");
    }
    Box (){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube

     Box (double side){

//        super(); To call the original Object class defined by Java

        this.l = side;
        this.h = side;
        this.w = side;
    }


    Box (Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }



    public static void information(){
        System.out.println("Running the box");
    }
}
