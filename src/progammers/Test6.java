package progammers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 과일장수
public class Test6 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            queue.offer(i);
        }

        while (queue.size() >= m) {
            int min = 99999;
            for (int i = 0; i < m; i++) {
                Integer poll = queue.poll();
                min = Math.min(min, poll);
            }
            answer += min * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        // 최고점수 k
        // 사과한박스는 m개

        // 최대이익?
        // 박스 안의 가장 낮은점수 * m
        new Test6().solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1});
        new Test6().solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }
}
