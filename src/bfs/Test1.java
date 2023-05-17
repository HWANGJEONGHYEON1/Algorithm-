package bfs;

import java.util.LinkedList;
import java.util.Queue;

// 송아지 찾기 BFS
public class Test1 {

    public static void main(String[] args) {
        // 앞 1, 뒤 1, 앞 5
        System.out.println(solution1(5, 14));
    }

    public static int solution1(int S, int N) {
        int[] check = new int[10001];
        check[S] = 1;
        int level = 0;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(S); // 현재 위치
        int[] distances = {1, -1, 5};

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int x = queue.poll();

                if (x == N) {
                    return level;
                }
                for (int distance : distances) {
                    int nx = x + distance;
                    if (nx > 0 && nx < 10001 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }

        return level;
    }

    public static int solution(int S, int N) {
        int answer = 0;
        int level = 0;
        int[] distance = {1, -1, 5};
        Queue<Integer> queue = new LinkedList<>();
        int[] check = new int[10000];

        check[S] = 1;
        queue.offer(S);
        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Integer x = queue.poll();

                if (x == N) {
                    return level;
                }

                for (int dis : distance) {
                    int nx = x + dis;
                    if (nx >=1 && nx <= 10000 && check[nx] == 0) {
                        queue.offer(nx);
                        check[nx] = 1;
                    }
                }
            }
            level++;
        }

        return answer;
    }
}
