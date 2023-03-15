package progammers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 영어 끝말잇기
public class Test6 {

    public static void main(String[] args) {
        new Test6().solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}); // 3, 3
        new Test6().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}); // 1, 3
    }

    //끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.
    //사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = i;
                System.out.println(true);
                System.out.println(answer[0]);
                System.out.println(answer[1]);
                return answer;
            }
            list.add(words[i]);

            if (i > 0 && !words[i - 1].endsWith(String.valueOf(list.get(i).charAt(0)))) {
                answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                answer[1] = i;
                System.out.println(false);
                System.out.println(answer[0]);
                System.out.println(answer[1]);
                return answer;
            }
        }
        return answer;
    }
}
