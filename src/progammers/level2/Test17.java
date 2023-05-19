package progammers.level2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// 디펜스 게임
public class Test17 {

    public static void main(String[] args) {
        System.out.println(new Test17().solution1(7, 3, new int[] {4, 2, 4, 5, 3, 3, 1})); // 5
    }
    //준호가 처음 가지고 있는 병사의 수 n, 사용 가능한 무적권의 횟수 k, 매 라운드마다 공격해오는 적의 수가 순서대로 담긴 정수 배열 enemy가 매개변수로 주어집니다. 준호가 몇 라운드까지 막을 수 있는지 return 하도록 solution 함수를 완성해주세요.
    public int solution1(int n, int k, int[] enemy) {
        int answer = enemy.length;

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            q.offer(enemy[i]);
            if (n < 0) {
                if (k > 0 && !q.isEmpty()) {
                    n += enemy[i];
                    k--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
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
