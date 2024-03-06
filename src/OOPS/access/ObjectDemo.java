package OOPS.access;

public class ObjectDemo {

    int num;
    float gpa;
    // already covered below two
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        if (obj == obj2) {
            System.out.println("obj is equal to obj2");
        }

        if (obj.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass().getName());
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
