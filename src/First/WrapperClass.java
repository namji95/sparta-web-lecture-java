package First;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        // boolean
        boolean flag = true;
        boolean flag1;
        flag1 = false;
        System.out.println("flag : " + flag + ", flag1 : " + flag1);

        // char
        char alphabet = 'A';
        System.out.println(alphabet);

        // byte, short, int, long
        byte byteNumber = 127; // -128 ~ 127(1byte)
        short shortNumber = 32767; // -32,768 ~ 32,767
        int intNumber = 214783647;
        long longNumber = 214783647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // float(4byte), double(8byte)
        float floatNumber = 0.123f;
        double doubleNumber = 0.123213123;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // String
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        // 배열
        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));

        // Wrapper Class
        int number = 3;
        Integer num = number; // 박싱
        num.intValue(); // 언박싱


    }
}
