package progammers.level1;

import java.util.Set;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
public class Test23 {

    public static void main(String[] args) {
        new Test23().solution(new int[] {2,1,3,4,1}); // [2,3,4,5,6,7]
        new Test23().solution(new int[] {5,0,2,7});
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set);

        return set.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
