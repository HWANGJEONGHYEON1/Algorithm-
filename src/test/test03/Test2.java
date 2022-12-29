package test.test03;

public class Test2 {
    /**
     *  N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마?
     *  input
     *  10 3
     *  12 15 11 20 25 10 20 19 13 15
     *  output
     *  56
     */

    public static void main(String[] args) {
        System.out.println(new Test2().solution());
    }

    public int solution() {
        int answer = 0;
        int sum = 0;
        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        int k = 3;
        // 12 + 15 + 11 < max
        // 15 11 + 20 - 12
        for (int i = 0; i < k; i++) {
           sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
