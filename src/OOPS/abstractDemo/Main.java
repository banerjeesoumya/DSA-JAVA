package OOPS.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Parent daughter = new Daughter(25);
        daughter.career();

        Parent.hello();
//        Parent mom = new Parent() {
        }
    }
