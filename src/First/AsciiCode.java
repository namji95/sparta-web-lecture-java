package First;

import java.util.Scanner;

public class AsciiCode {
    // 숫자 -> 문자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.

        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
        int ascii_number = (int)ch; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

        System.out.println(ch);

        // 문자 -> 숫자

        System.out.println(ascii_number);
    }
}