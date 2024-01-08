package Second;

public class OtherOperators {
    public static void main(String[] args) {
        /*
        Other_Operators (기타 연산자)
        1) 형변환 연산자
        2) 삼항 연산자
         */

        // 형변환 연산자
        int intNumber = 93 + (int) 98.8; // 93 + 98

        double doubleNumber = (double) 93 + 98.8; // 93.0 + 98.8

        System.out.println("93 + (int) 98.8 : " + (intNumber));
        System.out.println("(double) 93 + 98.8 : " + (doubleNumber));

        /*
        삼항 연산자
        비교 연산의 결과값에 따라 응답할 값을 직접 지정할 수 있는 연산자 입니다.
        삼항 연산자는 3가지 피연산자가 존재하여 삼항 연산자 라고 합니다. (`조건`/`참결과`/`거짓결과`)
        `(조건)` `?` `(참결과)` `:` `(거짓결과)`
         */
        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println("1 == 9 : " + b); // false

        String s = (x != y) ? "정답" : "땡";
        System.out.println("1 != 9 : " + s); // 땡

        int max = (x > y) ? x : y;
        System.out.println("(x > y) ? x : y : " + max); // 9

        int min = (x < y) ? x : y;
        System.out.println("(x < y) ? x : y : " + min); // 1
    }
}

/*

93 + (int) 98.8 : 191
(double) 93 + 98.8 : 191.8
1 == 9 : false
1 != 9 : 정답
(x > y) ? x : y : 9
(x < y) ? x : y : 1

 */