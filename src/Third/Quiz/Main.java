package Third.Quiz;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation());
        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("-", 30, 40));
        System.out.println(calculator.calculate("*", 50, 60));
        System.out.println(calculator.calculate("/", 70, 80));
    }
}
