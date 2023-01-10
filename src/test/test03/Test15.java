package test.test03;

import java.util.Stack;

/**

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

    private static int solution1() {
        int answer = 0;
        String input = "()(((()())(())()))(())";


        return answer;
    }
}
