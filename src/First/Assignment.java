package First;

import java.util.Scanner;

public class Assignment {
    /*
        요리 레시피 메모장 만들기
        1. 입력값
        - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해 줍니다.
        - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장 입력합니다.
        2. 출력값
        - 입력이 종료되면 요리 제목을 괄호에 감싸서 먼저 출력 해줍니다.
        - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력 해줍니다.
        - 바로 뒤에 정수 별점을 5점 만점 퍼센트로 표현했을 때 값을 실수로 출력 해줍니다.
        - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
    */
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        float rate = in.nextFloat();
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        String input3 = in.nextLine();
        String input4 = in.nextLine();
        String input5 = in.nextLine();
        String input6 = in.nextLine();
        String input7 = in.nextLine();
        String input8 = in.nextLine();
        String input9 = in.nextLine();
        String input10 = in.nextLine();

        // 출력
        System.out.println("[" + title + "]");
        int intRate = (int)rate;
        double percentageRate = (intRate * 100 / 5.0);
        System.out.println(percentageRate);
        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);

    }
}
