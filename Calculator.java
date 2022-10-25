import java.util.Stack;

public class Calculator {

    public static String exprToRPN(String expr){

        String current = "";
        int priority;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++){
            priority = getPosition(expr.charAt(i));
            if(priority == 0){

                current+=expr.charAt(i);

            }
            if(priority > 0) {
                current+=" ";
                while(!stack.empty()){
                    if(getPosition(stack.peek()) >= priority)current+=stack.pop();
                    else break;
                }
                stack.push(expr.charAt(i));
            }
        }

        while (!stack.empty())current+=stack.pop();

        return current;

    }

    public static double RPNtoAnswer(String rpn){
        String operand = new String();
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < rpn.length();i++){
            if (getPosition(rpn.charAt(i)) == ' ') continue;
            if (getPosition(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPosition(rpn.charAt(i)) == 0)
                    operand+=rpn.charAt(i++);
                if (i == rpn.length()) break;

                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
            if (getPosition(rpn.charAt(i)) > 0){
                double a = stack.pop(), b = stack.pop();
                if(rpn.charAt(i) == '+')stack.push(b+a);
                if(rpn.charAt(i) == '-')stack.push(b-a);
                if(rpn.charAt(i) == '*')stack.push(b*a);
                if(rpn.charAt(i) == '/')stack.push(b/a);
            }
        }
        return stack.pop();
    }

    private static int getPosition(char token){

        if (token == '*' || token == '/')  return 2;
        else if (token == '+' || token == '-') return 1;
        else return 0;

    }
}