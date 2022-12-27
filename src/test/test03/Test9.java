package test.test03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 매출액의 종류
public class Test9 {
    /**
     *설명
     *
     * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     *
     * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     * 입력
     * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     * 출력
     * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     * 입력
     * bacaAacba
     * abc
     * 출력 3
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int answer = 0;
//        String[] arr = "bacaAacba".split("");
        String input = "bacaAacba";
        String ana = "abc";
        int lt = 0;

        final int length = ana.length();
        for (int rt = 0; rt <= input.length() - length; rt++) {
            final String substring = input.substring(rt, length + rt);
            final String collect = Arrays.stream(substring.split(""))
                    .sorted()
                    .collect(Collectors.joining(""));
            if (collect.equals(ana)) {
                answer++;
            }
        }

        return answer;
    }

}
