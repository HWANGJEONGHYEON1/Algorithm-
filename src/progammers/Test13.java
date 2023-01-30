package progammers;

import java.util.HashMap;
import java.util.Map;

public class Test13 {
    static Map<Integer, Integer> scores = new HashMap<>();

    static  {
        scores.put(1, 3);
        scores.put(2, 2);
        scores.put(3, 1);
        scores.put(4, 0);
        scores.put(5, 1);
        scores.put(6, 2);
        scores.put(7, 3);
    }

    public static void main(String[] args) {
        solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5});
        solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3});
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> result = getResult(survey, choices);

        answer += getAnswer(result, "R", "T") + getAnswer(result,"C","F") + getAnswer(result,"J" , "M") + getAnswer(result, "A", "N");
        System.out.println(answer);
        return answer;
    }

    private static String getAnswer(Map<String, Integer> result, String a, String b) {
        int number1 = result.get(a) == null ? 0 : result.get(a);
        int number2 = result.get(b) == null ? 0 : result.get(b);

        return number1 >= number2 ? a : b;
    }

    private static Map<String, Integer> getResult(String[] survey, int[] choices) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split("");
            String ch1 = split[0];
            String ch2 = split[1];
            if (choices[i] < 4) {
                result.put(ch1, scores.get(choices[i]));
            } else {
                if (choices[i] != 4) {
                    result.put(ch2, scores.get(choices[i]));
                }
            }
        }
        return result;
    }
}
