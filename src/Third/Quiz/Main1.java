package Third.Quiz;

public class Main1 {
    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1(new AddOperation1());
        calculator.setOperation(new AddOperation1());
        System.out.println(calculator.calculate(10,10));
        calculator.setOperation(new SubstractOperation1());
        System.out.println(calculator.calculate(20,10));
        calculator.setOperation(new MultiplyOperation1());
        System.out.println(calculator.calculate(10,10));
        calculator.setOperation(new DivideOperation1());
        System.out.println(calculator.calculate(20,10));
    }
}
