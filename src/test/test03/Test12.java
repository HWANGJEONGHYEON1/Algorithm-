package test.test03;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 매출액의 종류
public class Test12 {
    /**
     * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     *
     * (A(BC)D)EF(G(H)(IJ)K)LM(N)
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution1());
    }

    private static String solution1() {
        StringBuilder answer = new StringBuilder();
        String input = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        Stack<String> stack = new Stack<>();
        String[] arr = input.split("");

        for (String s : arr) {
            if (s.equals(")")) {
                while (!stack.pop().equals("(")) {

                }
            } else {
                stack.push(s);
            }
        }

        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }

        return answer.toString();
    }

    private static String solution() {
        String answer = "";
        String input = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        Stack<String> stack = new Stack<>();

        String[] split = input.split("");
        for (String s : split) {
            if (")".equals(s)) {
                while (!stack.pop().equals("(")) {
                }
            } else {
                stack.push(s);
            }
        }

        while (!stack.isEmpty()) {
            answer = stack.pop() + answer;
        }
        return answer;
    }
}
