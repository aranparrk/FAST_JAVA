package ch15;

public class TakeTransTest {

    public static void main(String[] args) {

        Person edward = new Person("Edward", 20000);
        Taxi taxi = new Taxi("잘 간다 운수택시");
        edward.take(taxi);

        edward.showInfo();
        taxi.showInfo();

    }

}
