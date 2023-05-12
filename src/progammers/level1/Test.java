package progammers.level1;

//크기가 작은 부분문자열

public class Test {
    static int[] fibo;
    public static void main(String[] args) {
//        new Test().solution("3141592", "271");
//        new Test().solution("500220839878", "7");
//        new Test().solution("10203", "15");
//        new Test().recur(10);
//        new Test().dfs(11);
//        System.out.println(new Test().factorial(5));
        int n = 45;
        fibo = new int[n+1];
        fibo[1] = 1;
        fibo[2] = 1;
        new Test().fivonacci(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    private int fivonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo[n] = fivonacci(n - 2) + fivonacci(n - 1);
    }

    private int factorial(int i) {
        if (i == 1) {
            return 1;
        }

        return i * factorial(i - 1);
    }

    private void recur(int n) {
        if (n == 0) {
            return ;
        }
        recur(n - 1);
        System.out.print(n + " ");
    }

    private void dfs(int n) {
        if (n == 0) {
            return ;
        }

        dfs(n / 2);
        System.out.println(n % 2 + " ");
    }

    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String word = t.substring(i, i + p.length());
            if (Integer.parseInt(word) <= Integer.parseInt(p)) {
                answer++;
            }
        }

        System.out.println("901231-2190087".charAt(7));
//        System.out.println(answer);
        return answer;
    }
}
