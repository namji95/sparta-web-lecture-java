
/*
클래스
public : 접근제어자
 */

public class Main {

    /*
    JDK :
    1. Compiler : .java -> .class
    2. JRE
    3. JDB : 디버깅
     */

    /*
    () : 소괄호
    {} : 중괄호
    [] : 대괄호
     */

    /*
    main 메소드
    자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다
    = JVM의 약속

    public : 접근제어자
    static : 이 프로그램이 시작될 때 무조건 실행되는 역할
    void : return이 없다는 의미
    main : 메소드의 이름
    () : 파라미터 타입과 파라미터 값이 들어가는 곳
    {} : 메소드를 실행시킬 때 동작하는 영역
     */
    public static void main(String[] args) {

        /*
        객체 : 특징 (속성, 변수), 행동(메소드)
        print : 줄 바꿈 X
        println : 줄 바꿈 O
         */
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}