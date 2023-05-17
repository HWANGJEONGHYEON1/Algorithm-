package progammers.level2;

// 숫자 변환하기
public class Test13 {
    public static void main(String[] args) {
        // 자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.
        //
        //x에 n을 더합니다
        //x에 2를 곱합니다.
        //x에 3을 곱합니다.
        System.out.println(solution(10, 40, 5)); // 2;
    }

    public static int solution(int x, int y, int n) {
        int answer = 0;
        int[] dp = new int[y + 1];

        for (int i = x; i < y+1; i++) {
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }

            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 :  Math.min(dp[i] + 1, dp[i * 2]);
            }
        }


        return answer;
    }
}
