package Second;

import java.util.Arrays;

public class DeepCopy_ShallowCopy {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a1 = { 1, 2, 3, 4 };
        int[] b1 = a1; // 얕은 복사

        b1[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a1[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.

        // 깊은 복사
        int[] a2 = { 1, 2, 3, 4 };
        int[] b2 = new int[a2.length];

        for (int i = 0; i < a2.length; i++) {
            b2[i] = a2[i]; // 깊은 복사
        }

        b2[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a2[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

        // 깊은 복사 메서드

        // 1. clone() 메서드
        int[] a3 = { 1, 2, 3, 4 };
        int[] b3 = a3.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!


        // 2. Arrays.copyOf() 메서드
        int[] a4 = { 1, 2, 3, 4 };
        int[] b4 = Arrays.copyOf(a4, a4.length); // 배열과 함께 length값도 같이 넣어줍니다.

        // String 배열을 아래와 같이 선언과 생성할 수 있습니다.
        String[] stringArray1 = new String[3];

        // 선언 후 하나씩 초기화 할 수 있습니다.
        String[] stringArray2 = new String[3];
        stringArray2[0] = "val1";
        stringArray2[1] = "val2";
        stringArray2[2] = "val3";

        // 선언과 동시에 초기화 할 수 있습니다.
        String[] stringArray3 = new String[]{"val1", "val2", "val3"};
        String[] stringArray4 = {"val1", "val2", "val3"};

        // String 기능 활용하기

        String str = "ABCD";

        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

        // charAt(int index)
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

        // substring(int from, int to)
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

        // equals(String str)
        String newStr = "ABCD";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true 출력

        // toCharArray()
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환

        // 반대로 char[] 를 String로 변환하는 방법
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환
    }
}
