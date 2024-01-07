package First;

public class Casting {
    /*
    형 변환 예제 : 변수의 타입을 바꾸는 방법
    문자열 -> 숫자
    정수 -> 실수
    실수 -> 정수
     */
    public static void main(String[] args) {
        // double, float -> int
        // 실수 -> 정수 (0.xxx -> 0)
        double doubleNumber1 = 10.101010;
        float floatNumber1 = 10.1010f;
        System.out.println("doubleNumber1 : " + doubleNumber1);
        System.out.println("floatNumber1 : " + floatNumber1);

        // 변환(int)
        int intNumber1;
        int intNumber2;
        intNumber1 = (int)doubleNumber1;
        intNumber2 = (int)floatNumber1;
        System.out.println("intNumber1 : " + intNumber1);
        System.out.println("intNumber2 : " + intNumber2);

        // 정수 -> 실수
        int intNumber3 = 10;
        int intNumber4 = 1010;
        double doubleNumber2 = (double)intNumber3;
        float floatNUmber2 = (float)intNumber4;
        System.out.println("doubleNumber2 : " + doubleNumber2);
        System.out.println("floatNUmber2 : " + floatNUmber2);

        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
        // float는 부동소수점 대문에 long과 int보다 표현할 수 있는 식이 더 많아서

        // byte -> int
        byte byteNumber = 10;
        int intNumber5 = byteNumber;
        System.out.println("intNumber5 : " + intNumber5);

        // char(1byte) -> int
        char charAlphabet = 'A';
        int intNumber6 = charAlphabet;
        System.out.println("intNumber6 : " + intNumber6);

        // int -> long number
        int intNumber7 = 100;
        long longNumber = intNumber7;
        System.out.println("longNumber : " + longNumber);

        // int -> double
        int intNumber8 = 200;
        double doubleNumber3 = intNumber8;
        System.out.println("doubleNumber3 : " + doubleNumber3);

        // 작은 크기의 타입이 큰 크기의 타입과 계산될 때 자동으로 큰 크기의 타입으로 형변환 됩니다.
        int intNumber9 = 10;
        double doubleNumber4 = 5.5;
        System.out.println("intNumber9 + doubleNumber4 : " + (intNumber9 + doubleNumber4));

        // 정수 나누기
        int intResult = intNumber9 / 4;
        // 실수 나누기
        double doubleResult = intNumber9 / 4.0;
        System.out.println(intResult + " / " + doubleResult);
    }
}
