import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator1, operator2;
        int number1, number2, number3, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number from 1 to 10");
        number1 = input.nextInt();
        if (number1 < 1 || number1 > 10) {
            System.out.println("incorrect enter, please restart the program");
            System.exit(0);
        }

        System.out.println("Enter second number from 1 to 10");
        number2 = input.nextInt();
        if (number2 < 1 || number2 > 10) {
            System.out.println("incorrect enter, please restart the program");
            System.exit(0);
        }


        System.out.println("Enter third number from 1 to 10");
            number3 = input.nextInt();
            if (number3 < 1 || number3 > 10) {
                System.out.println("incorrect enter, please restart the program");
                System.exit(0);
            }

        System.out.println("Choose an first operator: +, -,*, or /");
        operator1 = input.next().charAt(0);

        System.out.println("Choose an second operator: +, -,*, / or whitespace");
        operator2 = input.next().charAt(0);

        switch (operator1) {

            case '+':
                switch (operator2) {
                    case '+' -> {
                        result = number1 + number2 + number3;
                        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + result);
                    }
                    case '-' -> {
                        result = number1 + number2 - number3;
                        System.out.println(number1 + " + " + number2 + " - " + number3 + " = " + result);
                    }
                    case '*' -> {
                        result = number1 + number2 * number3;
                        System.out.println(number1 + " + " + number2 + " * " + number3 + " = " + result);
                    }
                    case '/' -> {
                        result = number1 + number2 / number3;
                        System.out.println(number1 + " + " + number2 + " / " + number3 + " = " + result);
                    }
                    /*case ' ':
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;*/
                    default -> System.out.println("Invalid operator!");
                }
                break;

            case '-':
                switch (operator2) {
                    case '+' -> {
                        result = number1 - number2 + number3;
                        System.out.println(number1 + " - " + number2 + " + " + number3 + " = " + result);
                    }
                    case '-' -> {
                        result = number1 - number2 - number3;
                        System.out.println(number1 + " - " + number2 + " - " + number3 + " = " + result);
                    }
                    case '*' -> {
                        result = number1 - number2 * number3;
                        System.out.println(number1 + " - " + number2 + " * " + number3 + " = " + result);
                    }
                    case '/' -> {
                        result = number1 - number2 / number3;
                        System.out.println(number1 + " - " + number2 + " / " + number3 + " = " + result);
                    }
                    default -> System.out.println("Invalid operator!");
                }
                break;

            case '*':
                switch (operator2) {
                    case '+' -> {
                        result = number1 * number2 + number3;
                        System.out.println(number1 + " * " + number2 + " + " + number3 + " = " + result);
                    }
                    case '-' -> {
                        result = number1 * number2 - number3;
                        System.out.println(number1 + " * " + number2 + " - " + number3 + " = " + result);
                    }
                    case '*' -> {
                        result = number1 * number2 * number3;
                        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + result);
                    }
                    case '/' -> {
                        result = number1 * number2 / number3;
                        System.out.println(number1 + " * " + number2 + " / " + number3 + " = " + result);
                    }
                    default -> System.out.println("Invalid operator!");
                }
                break;

            case '/':
                switch (operator2) {
                    case '+' -> {
                        result = number1 / number2 + number3;
                        System.out.println(number1 + " / " + number2 + " + " + number3 + " = " + result);
                    }
                    case '-' -> {
                        result = number1 / number2 - number3;
                        System.out.println(number1 + " / " + number2 + " - " + number3 + " = " + result);
                    }
                    case '*' -> {
                        result = number1 / number2 * number3;
                        System.out.println(number1 + " / " + number2 + " * " + number3 + " = " + result);
                    }
                    case '/' -> {
                        result = number1 / number2 / number3;
                        System.out.println(number1 + " / " + number2 + " / " + number3 + " = " + result);
                    }
                    default -> System.out.println("Invalid operator!");
                }
        break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}