package progammers;


import java.util.HashMap;
import java.util.Map;

// 숫자 문자열과 영단어
public class Test18 {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
    }

    public static void main(String[] args) {
        System.out.println(new Test18().solution("one4seveneight")); // 1478
        System.out.println(new Test18().solution("23four5six7")); //234567
        System.out.println(new Test18().solution("2three45sixseven"));
    }

    public int solution(String s) {
        String answer = "";
        int lt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                answer += s.charAt(i);
                lt = i + 1;
                continue;
            }
            String substring = s.substring(lt, i+1);
            if (map.containsKey(substring)) {
                answer += map.get(substring);
                lt = i + 1;
            }
        }
        return Integer.parseInt(answer);
    }

}
