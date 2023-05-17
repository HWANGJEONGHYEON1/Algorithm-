package progammers.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// 할인행사
public class Test14 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }

    //마트의 할인 목록의 길이를 N이라고 했을 때 i를 할인 항목의 0번째 부터 N - 10까지 반복하면서 할인 항목과 할인 항목의 개수를 취합하여 구매하고자 하는 물건의 개수보다 같거다 큰 경우 마트 가입 가능 날짜라고 판단하고 가입 가능 날짜의 수를 반환
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - days + 1; i++) {
            Map<String, Integer> dMap = new HashMap<>();

            for (int j = 0; j < days; j++) {
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }

            Boolean isIdentical = true;

            for (String key : map.keySet()) {
                if (map.get(key) != dMap.get(key)) {
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical ? 1 : 0;
        }
        return answer;
    }
}
