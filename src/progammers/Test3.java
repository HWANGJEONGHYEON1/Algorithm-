package progammers;

import java.util.HashMap;
import java.util.Map;

// 문자열 나누기
public class Test3 {
    public static void main(String[] args) {
        new Test3().solution("banana"); // 3
        new Test3().solution("abracadabra"); // 6
        new Test3().solution("aaabbaccccabba"); // 3
    }
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);

        int count = 0;
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count == diff) {
                answer++;
                first = s.charAt(i);
            }

            if (first == s.charAt(i)) {
                count++;
            } else {
                diff++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
