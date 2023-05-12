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
        int i = 2;

        while (i < y) {
            x *= i;
            if (x >= y) {
                if (x == y) {
                    return answer;
                }
                i++;
                answer++;
            }
        }
        return answer;
    }
}
