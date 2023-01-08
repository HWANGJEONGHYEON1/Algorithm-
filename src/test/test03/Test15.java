package test.test03;

import java.util.Stack;

/**
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * 352+*9-
 * 12
 */
public class Test15 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int answer = 0;
        String input = "()(((()())(())()))(())";
        String input1 = "(((()(()()))(())()))(()())";
        String[] arr = input1.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push(arr[i]);
            } else {
                String pop = stack.pop();
                if (arr[i-1].equals("(")) {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }
}
