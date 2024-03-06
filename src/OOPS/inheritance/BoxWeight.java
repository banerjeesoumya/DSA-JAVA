package OOPS.inheritance;

public class BoxWeight extends Box {
    double weight;

//    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w);
//        this.weight = weight;
//    }

    public BoxWeight() {
        this.weight = -1;
        this.h = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // it is basically saying call the parent class constructor
        // the 'super' keyword is used to initialize va;ues present in parent class
//        System.out.println(super.w);
        this.weight = weight;
}
    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }



    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
