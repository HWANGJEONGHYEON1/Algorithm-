package progammers.level1;

import java.util.*;

// 올바른 괄호
public class Test31 {
    // "()()" 또는 "(())()" 는 올바른 괄호입니다.
    //")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
    public static void main(String[] args) {
        new Test31().solution("()()");// t
        new Test31().solution("(())()"); // t
        new Test31().solution(")()(");// f
    }

    boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();

        Queue<Character> queue = new LinkedList<>();
        if (chars[0] == ')') {
            return false;
        }
        for (Character character : chars) {

            if (character.equals(')')) {
                if (queue.size() > 0) {
                    queue.poll();
                }
            } else {
                queue.offer(character);
            }
        }
        System.out.println(queue.isEmpty());
        return answer;
    }
}
