package progammers;

// 다음 큰 숫자
public class Test32 {

    public static void main(String[] args) {
        System.out.println(new Test32().solution(78));
        System.out.println(new Test32().solution(15));
    }


    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        char[] chars = binary.toCharArray();
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (chars[i] == '1') {
                count++;
            }
        }

        for (int i = n+1; i < n + 10; i++) {
            String s = Integer.toBinaryString(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    cnt++;
                }
            }

            if (count == cnt) {
                return i;
            }
        }


        return answer;
    }
}
