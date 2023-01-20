package progammers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 푸드파이터
public class Test8 {

    public static void main(String[] args) {
        new Test8().solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1});
        new Test8().solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2});
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i : ingredient) {
            queue.add(i);
        }


        System.out.println(answer);
        return answer;
    }
}
