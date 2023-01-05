package test.test03;

import java.util.*;

// 매출액의 종류
public class Test11 {
    /**
     * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     *
     * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     * (()(()))(()
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static String solution1() {
        String answer = "YES";
//        String input = "(()(()))(()";
        String input = "(())";
        String[] split = input.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : split) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        if (map.get("(") == map.get(")")) {
            return answer;
        }
        return "NO";
    }

    private static String solution() {
        String input = "(()(()))(()";
//        String input = "(())";
        String[] split = input.split("");
        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if (s.equals("(")) {
                stack.add(s);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }
}
