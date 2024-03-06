package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human rick = new Human(20, "Soumya Banerjee", 20, false);
        Human rahul = new Human(34, "Rahul", 30, true);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    //this is not dependent on objects
    static void fun() {
        //greeting();//we can't use this because it requires an instance
        //but the function in which we are using it, that does not depend on instances

        //we cannot access non-static stuff without referencing their instances in
        //a static context

        //hence, here below I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    //we know that something which is not static, belongs to an object
    void greeting (){
        fun();
        System.out.println("Hello World");
    }
}
