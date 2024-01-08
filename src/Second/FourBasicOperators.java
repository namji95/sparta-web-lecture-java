package Second;

public class FourBasicOperators {
    public static void main(String[] args) {
        /*
        사칙연산
        a+b = x
        a,b는 피연산자 +는 연산자
         */

        // 덧셈
        System.out.println("--------------------덧셈--------------------");
        System.out.println("3 + 5 : " + (3 + 5));
        System.out.println("5 + 7 : " + (5 + 7));
        System.out.println("3 + 7 : " + (3 + 7));

        // 뺄셈
        System.out.println("--------------------뺄셈--------------------");
        System.out.println("3 - 5 : " + (3 - 5));
        System.out.println("7 - 5 : " + (7 - 5));
        System.out.println("7 - 3 : " + (7 - 3));

        // 곱셈
        System.out.println("--------------------곱셈--------------------");
        System.out.println("3 * 5 : " + (3 * 5));
        System.out.println("5 * 7 : " + (5 * 7));
        System.out.println("3 * 7 : " + (3 * 7));

        // 나눗셈 (몫)
        System.out.println("--------------------나눗셈(몫)--------------------");
        System.out.println("5 / 3 : " + (5 / 3));
        System.out.println("5 / 7 : " + (5 / 7));
        System.out.println("7 / 3 : " + (7 / 3));

        // 나눗셈 (나머지)
        System.out.println("--------------------나눗셈(나머지)--------------------");
        System.out.println("3 % 5 : " + (3 % 5));
        System.out.println("5 % 7 : " + (5 % 7));
        System.out.println("3 % 7 : " + (3 % 7));

        // 우선 순위 연산 (*,/,% 가 우선이고 다음으로 +,- 순서입니다.)
        System.out.println("--------------------사칙연산 우선순위--------------------");
        System.out.println("2 * 2 + 2 : " + (2 * 2 + 2));
        System.out.println("2 * 2 + 2 : " + (2 * (2 + 2)));

        // 변수 이용
        int a = 7;
        int b = 5;
        int c = 3;
        int d;

        //덧셈
        System.out.println("--------------------덧셈--------------------");
        System.out.println("a + b : " + (a + b));

        //뺄셈
    System.out.println("--------------------뺼셈--------------------");
        d = a - c;
        System.out.println("a - c : " + (d));

        //곱셈
        System.out.println("--------------------곱셈--------------------");
        System.out.println("b * c : " + (b * c));

        //나눗셈 (몫)
        System.out.println("--------------------나눗셈(몫)--------------------");
        d = a / c;
        System.out.println("a / c : " + (d));

        //나눗셈 (나머지)
        System.out.println("--------------------나눗셈(나머지)--------------------");
        System.out.println("a % c : " + (a % c));
    }
}

/*

--------------------덧셈--------------------
3 + 5 : 8
5 + 7 : 12
3 + 7 : 10
--------------------뺄셈--------------------
3 - 5 : -2
7 - 5 : 2
7 - 3 : 4
--------------------곱셈--------------------
3 * 5 : 15
5 * 7 : 35
3 * 7 : 21
--------------------나눗셈(몫)--------------------
5 / 3 : 1
5 / 7 : 0
7 / 3 : 2
--------------------나눗셈(나머지)--------------------
3 % 5 : 3
5 % 7 : 5
3 % 7 : 3
--------------------사칙연산 우선순위--------------------
2 * 2 + 2 : 6
2 * 2 + 2 : 8
--------------------덧셈--------------------
a + b : 12
--------------------뺼셈--------------------
a - c : 4
--------------------곱셈--------------------
b * c : 15
--------------------나눗셈(몫)--------------------
a / c : 2
--------------------나눗셈(나머지)--------------------
a % c : 1

 */