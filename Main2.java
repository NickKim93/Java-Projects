import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String str = sc.nextLine();
        System.out.println(Calculator.exprToRPN(str));
        System.out.println(Calculator.RPNtoAnswer(Calculator.exprToRPN(str)));
    }
}
