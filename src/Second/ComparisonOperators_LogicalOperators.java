package Second;

import java.sql.SQLOutput;
import java.util.zip.DeflaterInputStream;

public class ComparisonOperators_LogicalOperators {
    public static void main(String[] args) {
       /*
    Comparison Operators (비교연산자)
    Logical Operators (논리연산자)
     */
    /*
    논리연산자
    비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
    조건을 연결 하였을 때 boolean 값들을 조합하여 참(true) 또는 거짓(false) 값인 boolean 값을 출력
    &&(AND), ||(OR), !(NOT)
     */
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        // 피연산자 중 하나라도 true면 true => 또는 (OR : ||)
        System.out.println("--------------------OR--------------------");
        System.out.println("flag1 || flag2 : " + (flag1 || flag2));
        System.out.println("flag1 || flag2 || flag3 : " + (flag1 || flag2 || flag3));

        // 피연산자 모두 true면 true => 그리고 (AND : &&)
        System.out.println("--------------------AND--------------------");
        System.out.println("flag1 && flag2 : " + (flag1 && flag2));
        System.out.println("flag1 && flag2 && flag3 : " + (flag1 && flag2 && flag3));

        // AND
        System.out.println("--------------------AND--------------------");
        System.out.println("(5 > 3) && (3 > 1) : " + ((5 > 3) && (3 > 1)));
        System.out.println("(5 > 3) && (3 < 1) : " + ((5 > 3) && (3 < 1)));

        // OR, AND
        System.out.println("--------------------OR--------------------");
        System.out.println("(5 > 3) || (3 > 1) : " + ((5 > 3) || (3 > 1)));
        System.out.println("(5 > 3) || (3 < 1) : " + ((5 > 3) || (3 < 1)));
        System.out.println("(5 < 3) || (3 > 1) : " + ((5 < 3) || (3 > 1)));

        // 논리 부정 연산자 (NOT : !)
        System.out.println("--------------------NOT--------------------");
        System.out.println("!flag1 : " + (!flag1));
        System.out.println("!flag3 : " + (!flag3));
        System.out.println("!(3 == 3) : " + (!(3 == 3)));
    }
}

/*

--------------------OR--------------------
flag1 || flag2 : true
flag1 || flag2 || flag3 : true
--------------------AND--------------------
flag1 && flag2 : true
flag1 && flag2 && flag3 : false
--------------------AND--------------------
(5 > 3) && (3 > 1) : true
(5 > 3) && (3 < 1) : false
--------------------OR--------------------
(5 > 3) || (3 > 1) : true
(5 > 3) || (3 < 1) : true
(5 < 3) || (3 > 1) : true
--------------------NOT--------------------
!flag1 : false
!flag3 : true
!(3 == 3) : false

 */
