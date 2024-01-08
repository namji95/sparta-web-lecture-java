package Second;

public class WhileGrammar {
    public static void main(String[] args) {
        // while 문 : ~하는 동안
        int number1 = 0;
        while(number1 < 3) {
            number1++;
            System.out.println(number1 + "출력");
        }
        /*
        출력
        1출력
        2출력
        3출력
         */

        // do-while 문
        /*
        do {
            이 로직을 먼저 수행합니다.
        } while (조건);
         */
        int number2 = 4;
        do {
            System.out.println(number2 + "출력");
        } while(number2 < 3); // 연산을 한번 수행 후 조건문 체크
        /*
        출력
        4출력
         */

    }
}
