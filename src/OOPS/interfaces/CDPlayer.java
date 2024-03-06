package OOPS.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Media PLayer starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Player stops");
    }
}
