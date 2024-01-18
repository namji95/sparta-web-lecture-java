package Third.packageExample.main;

public class Main {
    public static void main(String[] args) {
        // 패키지가 다르다면 같은 클래스명 같은 이름의 메서드를 다르게 사용할 수 있습니다.
        // 지금은 import를 하지 않고 다른 패키지의 메서드를 사용하는 방법을 알아보기 위해 import를 하지 않았습니다.
        Third.packageExample.pk1.Car car1 = new Third.packageExample.pk1.Car();
        car1.horn();

        System.out.println();

        Third.packageExample.pk2.Car car2 = new Third.packageExample.pk2.Car();
        car2.horn();
    }
}
