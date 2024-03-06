package OOPS.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    //to initialize the static variable we make use of the static block which will get executed exactly once when the class is first loaded
    // will only run once, when the first object is created, i.e. when the class is loaded for the first time

    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
