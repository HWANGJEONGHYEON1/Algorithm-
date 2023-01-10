package test.test03;

import java.util.*;

/**
* 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
 *
 * 그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
 *
 * 그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
 *
 * 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
 *
 * 그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
 *
 * 이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.
 * 예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.
 *
 * 이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.
 *
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오.
 */
public class Test16 {

    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        int answer = 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int k = 3;

        Queue<Integer> queue = new LinkedList<>(list);

        while (queue.size() != 1) {
            for (int i = 0; i < k; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }
}
