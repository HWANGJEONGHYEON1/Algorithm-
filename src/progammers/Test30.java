package progammers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 문자열 마음대로 정렬하기
public class Test30 {
    //문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    // sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다
    public static void main(String[] args) {
        new Test30().solution(new String[] {"sun","bed","car"}, 1);
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> collect = Arrays.stream(strings)
                .sorted()
                .sorted(Comparator.comparingInt(a -> a.charAt(n)))
                .collect(Collectors.toList());

        for (int i = 0; i < strings.length;i ++) {
            answer[i] = collect.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
