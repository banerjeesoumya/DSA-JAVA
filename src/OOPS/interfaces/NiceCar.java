package OOPS.interfaces;

public class NiceCar {
    private Engine engine;

    private Media mediaPlayer = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMedia() {
        mediaPlayer.start();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
