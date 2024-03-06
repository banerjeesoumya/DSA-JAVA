package Strings;

import java.util.SplittableRandom;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rick";
        String b = "Rick";

        //==

//        System.out.println(a == b);

        String name1 = new String("Rick");
        String name2 = new String("Rick ");

//        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
