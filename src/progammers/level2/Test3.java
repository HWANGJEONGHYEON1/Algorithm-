package progammers.level2;


import java.util.*;
import java.util.stream.Collectors;

// 최솟값 만들기
public class Test3 {

    public static void main(String[] args) {
        System.out.println(new Test3().solution(new int[] {1,4,2}, new int[] {5, 4, 4})); // 29
        System.out.println(new Test3().solution(new int[] {1, 2}, new int[] {3, 4})); // 10
    }

    // 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
    public int solution(int []A, int []B) {
        int answer = 0;
        Queue<Integer> AQueue = new PriorityQueue<>();
        Queue<Integer> BQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
           AQueue.offer(A[i]);
           BQueue.offer(B[i]);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        while (!AQueue.isEmpty()) {
            answer += AQueue.poll() * BQueue.poll();
        }

        return answer;
    }
}
