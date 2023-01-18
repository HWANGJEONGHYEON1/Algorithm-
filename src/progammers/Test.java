package progammers;

//크기가 작은 부분문자열

public class Test {
    public static void main(String[] args) {
//        new Test().solution("3141592", "271");
//        new Test().solution("500220839878", "7");
        new Test().solution("10203", "15");
    }

    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String word = t.substring(i, i + p.length());
            if (Integer.parseInt(word) <= Integer.parseInt(p)) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
