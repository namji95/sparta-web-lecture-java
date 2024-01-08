package Second;

import java.util.Scanner;

public class IfGrammar {
    public static void main(String[] args) {
        // 조건문
        boolean flag1 = true;

        if (flag1) {
            System.out.println("flag1 값은 true 입니다."); // flag 값은 true 입니다. 출력
        }

        // 조건문 with else
        boolean flag2 = false;

        if (flag2) {
            System.out.println("flag2 값은 true 입니다."); // 미출력
        } else {
            System.out.println("flag2 값은 false 입니다."); // flag 값은 false 입니다. 출력
        }

        // 조건문 with else if
        int number1 = 2;

        if (number1 == 1) {
            System.out.println("number1 값은 1 입니다."); // 미출력
        } else if (number1 == 2) {
            System.out.println("number1 값은 2 입니다."); // number 값은 2 입니다. 출력
        } else {
            System.out.println("number1 값은 모르는 값입니다."); // 미출력
        }

        // 중첩 조건문
        boolean flag3 = true;
        int number2 = 2;

        if (flag3) {
            if (number2 == 1) {
                System.out.println("flag3 값은 true, number2 값은 1 입니다."); // 미출력
            } else if (number2 == 2) {
                System.out.println("flag3 값은 true, number2 값은 2 입니다."); // flag 값은 true, number 값은 2 입니다. 출력
            }
        } else {
            if (number2 == 1) {
                System.out.println("flag3 값은 false, number2 값은 1 입니다."); // 미출력
            } else if (number2 == 2) {
                System.out.println("flag3 값은 false, number2 값은 2 입니다."); // 미출력
            }
        }
    }
}
