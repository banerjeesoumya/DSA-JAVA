package Questions;

public class Welcome {
    static int w = 10;
    static int z;

    static void initiate (int x) {
        System.out.println("x = " + x);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }

//    static {
//        System.out.println("Welcome to GFG KIIT Student Chapter");
//        z = (int) Math.pow(w, 2);
//    }

    public static void main(String[] args) {
        initiate(10);
    }
}
