package progammers.level1;

// 푸드파이터
public class Test7 {

    public static void main(String[] args) {
        new Test7().solution(new int[] {1, 3, 4, 6});
        new Test7().solution(new int[] {1, 7, 1, 2});
    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i  = 1; i < food.length; i++) {
            int n = food[i] / 2;
            for (int j = 0; j < n; j++) {
                answer.append(i);
                result.append(i);
            }
        }
        result.append(0);
        for (int i = answer.length() - 1; i >= 0; i--) {
            result.append(answer.charAt(i));
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
