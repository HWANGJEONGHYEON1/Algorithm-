package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 인접행렬
public class Test2 {
    // 1번 정점에서 N번 정점으로 가는 모든 경로의 가지수
    static int answer = 0;
    static int[][] graph;
    static List<List<Integer>> graph1 = new ArrayList<>();
    static int n, m;
    static int[] ch;

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph1.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph1.get(a).add(b);
            graph[a][b] = 1;
        }

        ch[1] = 1;
        dfs1(1);
        System.out.println(answer);
    }

    public static void dfs1(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph1.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    dfs1(nv);
                    ch[nv] = 0;
                }

            }
        }
    }

    public static void dfs(int V) {
        if (V == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[V][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
