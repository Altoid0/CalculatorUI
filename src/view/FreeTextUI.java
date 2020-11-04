package view;

//imports
import control.MathCalc;
import control.MathCalc.OPERATOR;
import model.CalculatorModel;
import java.util.Scanner;
import model.CalculatorModel;

//Gautam Gupta
public class FreeTextUI {
    public static void testMain () throws InterruptedException {
        boolean control = true; //init var for loop control
        while (control) { //loop to run forever until user wants to exit
            //printing out all the possible operations
            System.out.println("Welcome to the Free Text Calculator!\nHere are the possible options for what operations you could do: ");
            System.out.println("1. Addition --> +");
            System.out.println("2. Subtraction --> -");
            System.out.println("3. Division --> /");
            System.out.println("4. Multiplication --> *");
            System.out.println("5. Modulus --> %");
            System.out.println("6. Exponent --> ^");
            System.out.println("7. Log --> log"); //base 10
            System.out.println("8. Trig (sin, cos, or tan) --> sin/cos/tan");
            System.out.println("9. Square Root --> sqrt");
            System.out.println("Exit --> Exit");
            System.out.println();

            //variable declarations
            String op = "";
            Double val1 = 0.0;
            Double val2 = 0.0;
            Double answer = 0.0;

            //Getting operation from user
            System.out.println("What operation do you want to do? \n");
            Scanner input = new Scanner(System.in);
            op = input.nextLine();
            System.out.println("You chose to do: " + op + ".");

            //if user selects 0, end program now
            if (op.equals("Exit")) {
                control = false;
                break;
            }

            //Getting arguments from user
            System.out.println("Now chose your two arguments: ");
            System.out.println("Arg1: ");
            val1 = input.nextDouble();
            System.out.println("Arg2: ");
            val2 = input.nextDouble();
            System.out.println();

            //switch-case for the operator the user types in
            switch(op){
                case "+":
                    CalculatorModel plus = new CalculatorModel(val1, OPERATOR.PLUS, val2); //calling the calc model to do the calculation
                    answer = plus.calcAnswerModel; //put answer into variable
                    break;
                case "-":
                    CalculatorModel minus = new CalculatorModel(val1, OPERATOR.MINUS, val2);
                    answer = minus.calcAnswerModel;
                    break;
                case "/":
                    CalculatorModel divide = new CalculatorModel(val1, OPERATOR.DIVIDE, val2);
                    answer = divide.calcAnswerModel;
                    System.out.println(op.length());
                    break;
                case "*":
                    CalculatorModel multiply = new CalculatorModel(val1, OPERATOR.MULTIPLY, val2);
                    answer = multiply.calcAnswerModel;
                    System.out.println(op.length());
                    break;
                case "%":
                    CalculatorModel modulus = new CalculatorModel(val1, OPERATOR.MODULUS, val2);
                    answer = modulus.calcAnswerModel;
                    System.out.println(op.length());
                    break;
                case "^":
                    CalculatorModel exponent = new CalculatorModel(val1, OPERATOR.EXPONENT, val2);
                    answer = exponent.calcAnswerModel;
                    break;
                case "log":
                    val2 = 0.0;
                    CalculatorModel log = new CalculatorModel(val1, OPERATOR.LOG, val2);
                    answer = log.calcAnswerModel;
                    break;
                case "sin":
                    val2 = 0.0;
                    CalculatorModel sin = new CalculatorModel(val1, OPERATOR.SIN, val2);
                    answer = sin.calcAnswerModel;
                    break;
                case "cos":
                    val2 = 0.0;
                    CalculatorModel cos = new CalculatorModel(val1, OPERATOR.COS, val2);
                    answer = cos.calcAnswerModel;
                    break;
                case "tan":
                    val2 = 0.0;
                    CalculatorModel tan = new CalculatorModel(val1, OPERATOR.TAN, val2);
                    answer = tan.calcAnswerModel;
                    break;
                case "sqrt":
                    val2 = 0.0;
                    CalculatorModel sqrt = new CalculatorModel(val1, OPERATOR.SQRT, val2);
                    answer = sqrt.calcAnswerModel;
                    break;
                case "Exit":
                    control = false;
                    break;
                default:
                    System.out.println("Your input was not recognized. Please try again");
            }
            //printing out the full expression (val1 + operator + val2 = answer)
            if (op.length() != 1) {
                System.out.println(op + "(" + val1 + ") = " + answer);
                Thread.sleep(2000);
            } else {
                System.out.println(val1 + " " + op + " " + val2 + " = " + answer);
                Thread.sleep(2000);
            }

            System.out.println();
        }

        System.out.println("Thank you for using the Free Text calculator!");
    }
}