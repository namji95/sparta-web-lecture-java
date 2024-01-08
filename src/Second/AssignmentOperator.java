package Second;

public class Assignment_Operator {
    public static void main(String[] args) {
        /*
        Assignment_Operator (대입연산자)
        변수를 연산해서 그 자리에서 저장하는(대입하는) 연산자
        =(기본연산자), +=, -=, *=, /=, %= <- 복합 대입 연산자
         */
        // 기본 대입연산자
        System.out.println("---------------기본 대입 연산자---------------");

        int num = 10;
        num = num + 5;
        System.out.println("num = num + 5 : " + (num));

        num = num - 5;
        System.out.println("num = num - 5 : " + (num));

        num = num * 5;
        System.out.println("num = num * 5 : " + (num));

        num = num / 5;
        System.out.println("num = num / 5 : " + (num));

        num = num % 5;
        System.out.println("num = num % 5 : " + (num));


        // 복합 대입연산자
        System.out.println("---------------복합 대입 연산자---------------");

        num += 15;
        System.out.println("num += 15 : " + (num));

        num -= 5;
        System.out.println("num -= 5 : " + (num));

        num *= 5;
        System.out.println("num *= 5 : " + (num));

        num /= 5;
        System.out.println("num /= 5 : " + (num));

        num %= 5;
        System.out.println("num %= 5 : " + (num));

        // ++, --
        num = 10;
        num++;
        System.out.println("num++ : " + (num));

        num--;
        System.out.println("num-- : " + (num));

        /*
        대입 연산자 주의점
        ++, --
        ++, -- 이 기호의 위치에 따라 연산이 달라집니다.
        ++, -- 연산 기호가 변수 앞에 존재하면 그 변수를 증감 시킨 후 메인 연산을 실행,
        ++, -- 연산 기호가 변수 뒤에 존재하면 그 변수의 메인 연산을 한 후 다시 연산하려고 할 때 적용됩니다.
         */
    }
}
