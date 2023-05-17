package bfs;

import java.io.IOException;
import java.util.*;

public class Test3 {
    static int answer = 0;
    static List<List<Integer>> graph1 = new ArrayList<>();
    static int n, m;
    static int[] ch, dis;

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n+1];
        dis = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph1.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph1.get(a).add(b);
        }

        ch[1] = 1;
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }

    // 2 : 1
    // 3 : 1
    // 4 : 1
    // 5 : 2
    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = 1;
        dis[v] = 0;

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph1.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
}
