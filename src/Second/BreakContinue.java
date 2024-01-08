package Second;

public class BreakContinue {
    public static void main(String[] args) {

        // break 명령
        int number3 = 0;
        while(number3 < 3) {
            number3++;
            if (number3 == 2) {
                break;  // 2일때 반복 중단
            }
            System.out.println(number3 + "출력");
        }
        /*
        출력
        1출력
         */

        // break 명령 범위
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
        }
        /*
        출력
        i: 0 // 바깥 반복문 부터 수행 시작
        j: 0 // 안쪽 반복문 1회차 수행
        j: 1
        j: 2 // j 가 2일때 안쪽 반복문 break;
        i: 1 // 바깥 반복문은 아직 break; 호출이 안됬으므로 다음 반복수행
        j: 0 // 안쪽 반복문 2회차 수행
        j: 1
        j: 2 // j 가 2일때 안쪽 반복문 두번째 break;
        i: 2 // i 가 2일때 바깥 반복문도 break; 호출되어 종료
         */

        // continue 명령
        int number4 = 0;
        while(number4 < 3) {
            number4++;
            if (number4 == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number4 + "출력");
        }
        /*
        출력
        1출력
        3출력
         */

    }
}
