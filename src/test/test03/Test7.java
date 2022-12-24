package test.test03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test7 {
    public static void main(String[] args) {

        System.out.println(solution1("AbaAeCe", "baeeACA"));
        System.out.println(solution1("abaCC", "Caaab"));
    }

    // 강사님 풀이
    private static String solution1(String a, String b) {
        final String[] split = a.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String alpha : split) {
            map.put(alpha, map.getOrDefault(alpha, 0) + 1);
        }

        final String[] bArr = b.split("");
        for (String s : bArr) {
            if (!map.containsKey(s)) {
                return "NO";
            }

            map.put(s, map.get(s) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                return "NO";
            }
        }

        return "YES";
    }

    // 내 풀이
    private static String solution(String a, String b) {
        boolean isRight = false;

        final Map<String, Integer> firstMap = makeMap(a);
        final Map<String, Integer> secondMap = makeMap(b);
        int count = 0;
        for (String s : secondMap.keySet()) {
            if (firstMap.get(s).equals(secondMap.get(s))) {
                count++;
            }
        }

        if (count == firstMap.keySet().size()) {
            isRight = true;
        }

        return isRight ? "YES" : "NO";
    }

    private static Map<String, Integer> makeMap(String s) {

        final String[] split = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String alpha : split) {
            map.put(alpha, map.getOrDefault(alpha, 0) + 1);
        }

        return map;
    }
}
