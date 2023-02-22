package progammers;

public class Test28 {

    //양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public static void main(String[] args) {
//        new Test28().solution(10); //t
//        new Test28().solution(12); //t
        new Test28().solution(11); // f
        new Test28().solution(13);  // f

        // 2
    }

    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int n = x;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return x % sum == 0 ? true : false;
    }
}
