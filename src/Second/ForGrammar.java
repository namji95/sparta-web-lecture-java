package Second;

public class ForGrammar {
    public static void main(String[] args) {
        // for 문
        // (초기값; 조건문; 증감연산)
        for(int i=0; i < 4; i++) { // 변수 i 값은 0 ~ 3 까지 반복
            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
        }
        /*
        출력
        0번째 출력
        1번째 출력
        2번째 출력
        3번째 출력
         */

        /*
        향상된 for문
        기존 : for문 안에 3개의 표현이 들어갑니다. (초기값; 조건문; 증감연산)
        향상된 for문 : 2개로 줄여줍니다.
         */

        // 향상된 for 문
        int[] numbers1 = {3,6,9,12,15};
        for(int number: numbers1) {
            System.out.print(number + " ");
        }
        // 출력
        // 3 6 9 12 15

        // 만약 기존 for 문으로 구현한다면?

        int[] numbers2 = {3,6,9,12,15};
        for(int i = 0; i < numbers2.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
            System.out.println(numbers2[i]);
        }
        // 출력
        // 3 6 9 12 15
    }
}
