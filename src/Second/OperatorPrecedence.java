package Second;

public class OperatorPrecedence {
    public static void main(String[] args) {
        /*
        Operator Precedence (연산자 우선순위)
        연산자 우선순위 : 산술 > 비교 > 논리 > 대입
        연산자 여러개가 함께 있는 연산을 계산할때는 우선순위가 있습니다.
        위 우선순위에 따라서 최종적인 응답값이 결정됩니다.
        단, 괄호로 감싸주면 괄호안의 연산이 최우선순위로 계산됩니다.
         */

        // 연산자 우선순위
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println("x < y && y < z : " + (result)); // true

        result = x + 10 < y && y < z; // +10 산술연산자 계산 후 <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println("x + 10 < y && y < z : " + (result)); // false

        result = x + 2 * 3 > y; // 산술연산자 곱센 > 덧셈 순으로 계산 후 > 비교연산자 계산
        System.out.println("x + 2 * 3 > y : " + (result)); // false (8>9)

        result = (x + 2) * 3 > y; // 괄호안 덧셈 연산 후 괄호 밖 곱셈 계산 후 > 비교연산자 계산
        System.out.println("(x + 2) * 3 > y : " + (result)); // true (12>9)
    }
}

/*

x < y && y < z : true
x + 10 < y && y < z : false
x + 2 * 3 > y : false
(x + 2) * 3 > y : true

 */