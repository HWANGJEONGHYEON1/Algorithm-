package test.test03;

import java.util.*;

// 매출액의 종류
public class Test8 {
    /**
     * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
     *
     * 20 12 20 10 23 17 10
     *
     * 각 연속 4일간의 구간의 매출종류는
     *
     * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
     *
     * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
     *
     * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
     *
     * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
     *
     * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
     *
     * 3 4 4 3
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    // 선생님 풀이 슬라이스
    private static int[] solution1(int K) {
        int[] answer = new int[K];
        int[] arr = {20, 12, 20, 10, 23, 17, 10};
        int lt = 0;

    }

    // 내 풀이
    private static int[] solution(int K) {
        int[] answer = new int[K];
        int[] arr = {20, 12, 20, 10, 23, 17, 10};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - K + 1; i++) {
            for (int j = 0; j < K; j++) {
                set.add(arr[i + j]);
            }
            answer[i] = set.size();
            set.clear();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
