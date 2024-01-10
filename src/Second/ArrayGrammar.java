package Second;

import java.util.Arrays;

public class ArrayGrammar {
    public static void main(String[] args) {

        // 배열 선언
        // 일반적인 선언방식
        int[] intArray1;    // 정수 배열
        long[] longArray1;
        double[] doubleArray1;  // 실수 배열
        char[] charArray1;  // 문자 배열
        String[] stringArray1; // 문자열 배열

        // 배열 선언
        // 2번째 선언방식
        int intArray2[];    // 정수 배열
        long longArray2[];
        double doubleArray2[];  // 실수 배열
        char charArray2[];  // 문자 배열
        String stringArray2[]; // 문자열 배열

        // 배열 생성
        //배열 생성후 초기화하면 배열의 주소가 할당된다.
        int[] intArray3 = new int[3]; // 초기값 {0,0,0}
        boolean[] boolArray3 = new boolean[3]; // 초기값 {false, false, false}
        String[] stringArray3 = new String[3]; // 초기값 {"","",""}

        //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
        int[] intArray4;
        intArray4 = new int[3]; // 초기값 {0,0,0}

        // 배열 단건조회
        int[] intArray5 = new int[3]; // 모두 0으로 초기화된 사이즈8의 배열 생성
        // 배열에서 2번쨰 순번의 값을 출력해본다. (0부터 순번이 시작하므로 2번째 순번은 1)
        System.out.println(intArray5[1]);

        //길이가 8인 정수배열 선언
        int[] intArray6 = new int[3];
        // 배열이 초기화된 값을 출력해본다.
        for(int i=0; i<intArray6.length; i++) { // .length 는 배열의 길이
            System.out.println(intArray6[i]);
        }

        // 배열 초기화
        //1. 배열에 특정값 대입하며 선언
        int[] intArray7 = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        //2-1. for문을 통해 값을 대입
        for (int i = 0; i < intArray7.length; i++) {
            intArray7[i] = i;
        }

        //2-2. 향상된 for문을 통한 배열 출력
        for (int i : intArray7) {
            System.out.print(i); // 01234
        }

        System.out.println(); // 줄바꿈

        //3. 배열의 주소를 모두 같은값으로 초기화
        Arrays  .fill(intArray7, 1);//배열의 모든 값을 1로 초기화

        for (int i : intArray7) {
            System.out.print(i);  // 11111
        }
    }
}
