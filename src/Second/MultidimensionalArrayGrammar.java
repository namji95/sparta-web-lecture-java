package Second;

public class MultidimensionalArrayGrammar {
    public static void main(String[] args) {
        // 중괄호를 사용해 초기화
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 반복문을 통한 초기화
        int[][] array2 = new int[2][3]; // 최초 선언

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = 0;  // i, j 는 위 노란색 네모박스 안에있는 숫자를 의미하며 인덱스 라고 부릅니다.
            }
        }


        // 가변 배열
        // 선언 및 초기화
        int[][] array3 = new int[3][];
        // 배열 원소마다 각기다른 크기로 지정 가능합니다.
        array3[0] = new int[2];
        array3[1] = new int[4];
        array3[2] = new int[1];
        // 위 배열은 밑 배열과 같은 크기의 배열이 됩니다.

        // 중괄호 초기화할때도 원소배열들의 크기를 각기 다르게 생성 가능합니다.
        int[][] array4 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}

        };

        // 3차원 배열의 이해
        // 중괄호 3개를 써서 3차원 배열 초기화를 할 수 있습니다.
        int[][][] MultiArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        // 가변 2차원 배열 조회
        int[][] array5 = {
                {10, 20, 30},
                {10, 20, 30, 40},
                {10, 20}
        };

        for (int i = 0; i < array5.length; i++) { // 1차원 길이
            for (int j = 0; j < array5[i].length; j++) { // 2차원 길이
                System.out.println(array5[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }

        // 최대값 구하기

        int[] arr1 = { 3, 2, 1, 5, 1 };

        // 최대값 초기값 세팅
        int max = arr1[0];

        // 최대값 구하기
        for (int num : arr1) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }

        // 최대값 5 출력
        System.out.println(max);

        // 최소값 구하기

        int[] arr2 = { 3, 2, 0, 5, 1 };

        // 최소값 초기값 세팅
        int min = arr2[0];

        // 최소값 구하기
        for (int num : arr2) {
            if (num < min) { // 반복문 돌면서 나(min)보다 값이 작으면 저장
                min = num;
            }
        }

        // 최소값 1 출력
        System.out.println(min);
    }
}
