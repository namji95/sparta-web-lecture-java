package Third.packageExample.main;

import Third.packageExample.pk1.Car;

public class Main1 {
    public static void main(String[] args) {
        //
        Car car1 = new Car();
        Third.packageExample.pk2.Car car2 = new Third.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
    }
}
