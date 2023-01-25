package progammers;


import java.util.*;
import java.util.stream.Collectors;

// 옹알이
public class Test9 {
    private final List<String> canSpeak = Arrays.asList("aya", "ye", "woo", "ma");

    public static void main(String[] args) {
        new Test9().solution(new String[] {"aya", "yee", "u", "maa"});
        new Test9().solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }

    public int solution(String[] babbling) {
        int answer = 0;

        List<String> repeatList = canSpeak.stream()
                .map(b -> b.concat(b))
                .collect(Collectors.toList());

        for (String speak : babbling) {
            for (String s : repeatList) {
                speak = speak.replace(s, "X");
            }

            for (String s : canSpeak) {
                speak = s.replace(s, "Y");
            }
        }
        System.out.println(answer);
        return answer;
    }
}
