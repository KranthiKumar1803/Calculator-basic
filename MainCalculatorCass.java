import java.util.Scanner;

public class MainCalculatorCass {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Here is the first number from user ::");
        int firstNumber = userInput.nextInt();

        System.out.println("Here is the second number from user ::");
        int secondNumber = userInput.nextInt();

        Numbers n = new Numbers();

        n.setFirstNumber(firstNumber);
        n.setSecondNumber(secondNumber);

          CalculatorLogic calculatorLogic = new CalculatorLogic();

        int addResult = calculatorLogic.addNumbers(n.getFirstNumber(),n.getSecondNumber());
        System.out.println("Let's the add method():: "  + addResult);

        int subResult = calculatorLogic.subtractNumbers(n.getFirstNumber(),n.getSecondNumber());
        System.out.println("Let's the add method():: "  + subResult);

        int multiplyResult = calculatorLogic.multiplyNumbers(n.getFirstNumber(),n.getSecondNumber());
        System.out.println("Let's the add method():: "  + multiplyResult);

        int divideResult = calculatorLogic.divideNumbers(n.getFirstNumber(),n.getSecondNumber());
        System.out.println("Let's the add method():: "  + divideResult);

         /* int addResult = calculatorLogic.addNumbers(x,y);
          System.out.println("Here is the addResult :: " + addResult);

          int subResult = calculatorLogic.subtractNumbers(x,y);
          System.out.println("Here is the addResult :: " + subResult);

        int multiplyResult = calculatorLogic.multiplyNumbers(x,y);
        System.out.println("Here is the multiplyResult :: " + multiplyResult);

        int divisibleResult = calculatorLogic.divideNumbers(x,y);
        System.out.println("Here is the multiplyResult :: " + divisibleResult);
*/
    }
}
