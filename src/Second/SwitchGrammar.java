package Second;

public class SwitchGrammar {
    public static void main(String[] args) {
        // switch/case 문

        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "1월";
                break;
            case 2:  monthString = "2월";
                break;
            case 3:  monthString = "3월";
                break;
            case 4:  monthString = "4월";
                break;
            case 5:  monthString = "5월";
                break;
            case 6:  monthString = "6월";
                break;
            case 7:  monthString = "7월";
                break;
            case 8:  monthString = "8월";
                break;
            case 9:  monthString = "9월";
                break;
            case 10: monthString = "10월";
                break;
            case 11: monthString = "11월";
                break;
            case 12: monthString = "12월";
                break;
            default: monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력

        // if vs switch
        // switch 문 실습 코드를 if 문으로 바꿔보겠습니다.

        // if 로 변환
        if (month == 1) {
            monthString = "1월";
        } else if (month == 2) {
            monthString = "2월";
        } else if (month == 3) {
            monthString = "3월";
        } else if (month == 4) {
            monthString = "4월";
        } else if (month == 5) {
            monthString = "5월";
        } else if (month == 6) {
            monthString = "6월";
        } else if (month == 7) {
            monthString = "7월";
        } else if (month == 8) {
            monthString = "8월";
        } else if (month == 9) {
            monthString = "9월";
        } else if (month == 10) {
            monthString = "10월";
        } else if (month == 11) {
            monthString = "11월";
        } else if (month == 12) {
            monthString = "12월";
        } else {
            monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력
    }
}
