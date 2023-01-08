package test.test03;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * 352+*9-
 * 12
 */
public class Test14 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        String input = "352+*9-";
        String[] arr = input.split("");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i])) {
                stack.push(Integer.parseInt(arr[i]));
            } else {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(operation(n2, n1, arr[i]));
            }
        }

        return stack.pop();
    }

    public static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int operation(int n1, int n2, String operator) {
        switch (operator) {
            case "+" :
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
        }

        return 0;
    }
}
