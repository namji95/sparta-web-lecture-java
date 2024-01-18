package Third.basicClass;

public class Main {
    public static void main(String[] args) {

        // 객체를 생성할 때 new 키워드를 이용하여 생성자 호출
        Car car1 = new Car(); // Car 클래스를 이용하여 객체 생성 new 키워드를 이용하여 생성자 호출
        Car car2 = new Car(); // Car 클래스를 이용하여 객체 생성 new 키워드를 이용하여 생성자 호출

        System.out.println(car1); // car1에 대한 주소값 Third.basicClass.Car@4eec7777
        System.out.println(car2); // car2에 대한 주소값 Third.basicClass.Car@3b07d329

        Car[] carArray = new Car[3];
        Car car3 = new Car();
        car3.chageGear('P');
        carArray[0] = car3;

        Car car4 = new Car();
        car4.chageGear('N');
        carArray[1] = car4;

        Car car5 = new Car();
        car5.chageGear('D');
        carArray[2] = car5;

        for (Car car : carArray) {
            System.out.println("car.gear = " + car.gear);
            /**
             * car.gear = P
             * car.gear = N
             * car.gear = D
             */
        }

        Car car6 = new Car(); // 객체 생성

        // 초기값과 기본값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
        System.out.println("car6.model = " + car6.model);
        System.out.println("car6.color = " + car6.color);
        System.out.println();

        System.out.println("car6.speed = " + car6.speed);
        System.out.println("car6.gear = " + car6.gear);
        System.out.println("car6.lights = " + car6.lights);
        System.out.println();

        System.out.println("car6.tire = " + car6.tire);
        System.out.println("car6.door = " + car6.door);
        System.out.println();

        // 필드 사용
        car6.color = "blue"; // 필드 color에 "blue" 데이터를 저장
        car6.speed = 100;
        car6.lights = false;

        System.out.println("car6.color = " + car6.color);
        System.out.println("car6.speed = " + car6.speed);
        System.out.println("car6.lights = " + car6.lights);

        // 객체 생성
        Car car7 = new Car();
        // 메서드 호출 및 반환값을 저장
        System.out.println("페달 밟기 전 = " + car7.gear);
        double speed = car7.gasPedal(100, 'D');
        System.out.println("car7.speed = " + speed);

        boolean lights = car7.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println("페달 밟은 후 = " + car7.gear);

        car7.carSpeeds(100, 80);
        System.out.println();
        car7.carSpeeds(100, 120, 140);
    }
}
