package OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box5 = new BoxWeight(2, 3, 4, 5);
//        BoxPrice box1 = new BoxPrice(2, 3, 5, 14, 170);
//        System.out.println(box1.cost);
        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box4.h + " " + box4.weight);


    }
}
//        Box box1 = new Box(5, 6, 7);
//        Box box2 = new Box(box1);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

//        BoxWeight box3 = new BoxWeight();

//        Box box5 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box5);

//        there are many variables in both parent and child classes
//        here in the below example the reference variable - box6 is of reference type BoxWeight(child class) which is referencing to a object type of Box(parent class)
//        i am given access to variables that are in the reference type, i.e in the below example BoxWeight
//        hence, we should have access to the weight variable
//        this also means, that the ones i am trying to access should have initialised
//        but here, when the object itself is referenced to the parent class, how we will call the constructor the child class
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

//        BoxPrice box = new BoxPrice(5, 8, 200);

//        Box box = new BoxWeight();
//        box.greeting();

//    }
//}
