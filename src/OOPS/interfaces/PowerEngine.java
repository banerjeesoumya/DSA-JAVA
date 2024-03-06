package OOPS.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }
}
