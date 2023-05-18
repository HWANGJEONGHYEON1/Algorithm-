package progammers.level2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// 디펜스 게임
public class Test17 {

    public static void main(String[] args) {
        System.out.println(new Test17().solution(7, 3, new int[] {4, 2, 4, 5, 3, 3, 1})); // 5
    }

    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int my = n;
        int card = k;

        for (int i = 0; i < enemy.length; i++) {
            my -= enemy[i];
            pq.offer(enemy[i]);

            if (my < 0) {
                if (!pq.isEmpty() && card > 0) {
                    my += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}
