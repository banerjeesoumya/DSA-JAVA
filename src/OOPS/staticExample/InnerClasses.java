package OOPS.staticExample;

//outside classes cannot be static as it is not dependent on any other class
public class InnerClasses {
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test ("Rick");
        Test b = new Test("Soumya");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
