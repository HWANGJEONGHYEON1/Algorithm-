package progammers.level1;

// 신규아이디 추천
public class Test20 {

    public static void main(String[] args) {
        System.out.println(new Test20().solution("...!@BaT#*..y.abcdefghijklm")); //"bat.y.abcdefghi"
    }

    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase().replaceAll("[^a-z\\d\\-_.]*", "");

        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        if (answer.length() == 0 ) {
            answer = "a";
        }

        if (answer.length() <= 2) {
            System.out.println(answer.substring(answer.length()-1));
            while (answer.length() <= 2) {
                answer += answer.substring(answer.length()-1);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
