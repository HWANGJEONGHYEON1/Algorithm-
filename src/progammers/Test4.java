package progammers;

import java.util.*;

// 명예의전당
public class Test4 {
    public static void main(String[] args) {
        new Test4().solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}); // 3
        new Test4().anotherSolution(3, new int[] {10, 100, 20, 150, 1, 100, 200}); // 3
        new Test4().solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}); // 6
    }

    public int[] anotherSolution(int k, int[] score) {
        Queue<Integer> queue = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            queue.offer(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            answer[i] = queue.peek();
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[k];
        List<Integer> list = new LinkedList<>();
        int[] result = new int[score.length];

        if (k > score.length) {
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);
                result[i] =  getMinNumberOfArray(list);
            }
        } else {
            for (int i = 0; i < k; i++) {
                list.add(score[i]);
                result[i] =  getMinNumberOfArray(list);
            }

            for (int i = k; i < score.length; i++) {
                int minNumberOfArray = getMinNumberOfArray(list);
                if (score[i] > minNumberOfArray) {
                    list.remove(Integer.valueOf(minNumberOfArray));
                    list.add(score[i]);
                }
                result[i] = getMinNumberOfArray(list);
            }
        }

        return result;
    }

    private static int getMinNumberOfArray(List<Integer> list) {
        return Collections.min(list);
    }
}

