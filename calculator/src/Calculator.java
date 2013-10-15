import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/14/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
//Math functions
enum MathFunction { ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION } ;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    public void processExpression() {

        System.out.println("Single number");
        int a = this.scanner.nextInt();

        System.out.println("+ or - or * or /");
        char operation = this.scanner.next().charAt(0);
        MathFunction function = this.getFunctionForOperation(operation);

        System.out.println("Single number");
        int b = this.scanner.nextInt();

        float calculation = this.getCalculation(a, b, function);
        System.out.println(calculation);
    }

    private MathFunction getFunctionForOperation(char operation) {
        MathFunction function;
        if(operation == '+') {
            function = MathFunction.ADDITION;
        } else if(operation == '-') {
            function = MathFunction.SUBTRACTION;
        } else if(operation == '*') {
            function = MathFunction.MULTIPLICATION;
        } else {
            function = MathFunction.DIVISION;
        }

        return function;
    }

    private float getCalculation(int firstNum, int secondNum, MathFunction function) {
        float calculation;

        if(function == MathFunction.ADDITION) {
            calculation = firstNum + secondNum;
        } else if(function == MathFunction.SUBTRACTION) {
            calculation = firstNum - secondNum;
        } else if(function == MathFunction.MULTIPLICATION) {
            calculation = firstNum * secondNum;
        } else {
            calculation = firstNum / secondNum;
        }

        return calculation;
    }
}
