package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCat() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    final public void run() {
        startCat();
        drive();
        washCar();
        stop();
        turnOff();
    }
}
