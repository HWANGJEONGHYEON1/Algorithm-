package progammers;

import java.util.HashMap;
import java.util.Map;

//가장 가까운 같은 글자
public class Test2 {

    public static void main(String[] args) {
        new Test2().solution("banana");
        //  [-1, -1, -1, 2, 2, 2]
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] alpha = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < alpha.length; i++) {
            if (!map.containsKey(alpha[i])) {
                answer[i] = -1;
                map.put(alpha[i], i);
            } else {
                int currentPoint = map.get(alpha[i]);
                answer[i] = i - currentPoint;
                map.put(alpha[i], i);
            }
        }

        return answer;
    }
}
