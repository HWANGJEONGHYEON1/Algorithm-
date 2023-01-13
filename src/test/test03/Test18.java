package test.test03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
 * • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
 * • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
 * 즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
 * 현재 N명의 환자가 대기목록에 있습니다.
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
 * 대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.
 *
 * 5 2
 * 60 50 70 80 90
 */
public class Test18 {

    public static void main(String[] args) {
        System.out.println(solution(5, 2, "60 50 70 80 90")); // 3
        System.out.println(solution(6, 3, "70 60 90 60 60 60")); // 4
    }

    public static class Person {
        int index;
        int priority;

        public Person(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    private static int solution(int n, int m, String danger) {
        int answer = 0;
        List<Integer> dangerList = Arrays.stream(danger.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < dangerList.size(); i++) {
            queue.offer(new Person(i, dangerList.get(i)));
        }


        while (!queue.isEmpty()) {
            Person target = queue.poll();

            for (Person person : queue) {
                if (target.priority < person.priority) {
                    queue.offer(target);
                    target = null;
                    break;
                }
            }

            if (target != null) {
                if (target.index == m) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }
}
