package Third.Quiz;

public class Calculator1 {
    private AbstractOperation operation;

    public Calculator1 (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate (int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}
