package progammers.level1;

public class Test22 {

    public static void main(String[] args) {
        new Test22().solution(45);
        new Test22().solution(125);
    }

    public int solution(int n) {
        int answer = 0;
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }


        return Integer.parseInt(str, 3);
    }
}
