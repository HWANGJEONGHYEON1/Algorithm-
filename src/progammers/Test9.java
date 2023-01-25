package progammers;


import java.util.*;

// 옹알이
public class Test9 {
    private final List<String> canSpeak = Arrays.asList("aya", "ye", "woo", "ma");

    public static void main(String[] args) {
        new Test9().solution(new String[] {"aya", "yee", "u", "maa"});
        new Test9().solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }

    public int solution(String[] babbling) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for (String speak : babbling) {

            for (String s : canSpeak) {
                speak = speak.replace(s, " ");
            }
            System.out.println(speak);
            if (speak.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
