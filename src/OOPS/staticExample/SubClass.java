package OOPS.staticExample;

import OOPS.access.A;

import java.util.ArrayList;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Rick");
//        int n = obj.num; //it will show error as the subclass can access the protected members of the base class, the base class itself does not know what all child class is inheriting them.
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(45, "Rick");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Rick");
//        int n = obj.num;
    }
}