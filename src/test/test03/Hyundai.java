package test.test03;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 로그 화인
 * IN/OUT
 * 로그인 로그아웃이 한 쌍이 아닐 경우, 로그인 시각보다 로그아웃 시각이 빠를경우
a 13:00 IN
b 14:00 IN
b 14:00 OUT
c 15:00 OUT
a 16:00 OUT
c 11:00 OUT
a 01:00 IN
a 19:00 OUT
 *
 * 결과 3
 */

// 꼭 풀어보기
public class Hyundai {

    public static void main(String[] args) {
        System.out.println(solution()); // 7 5 3 2 6
    }

    private static int solution() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        List<Person> loginPersons = new ArrayList<>();
        List<Person> logOutPersons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            String name = scanner.next();
            int time = Integer.parseInt(scanner.next().replace(":", ""));
            String log = scanner.next();
            if (log.equals("IN")) {
                loginPersons.add(new Person(name, time, log));
            } else {
                logOutPersons.add(new Person(name, time, log));
            }
        }

        List<Person> sortedLoginPerson = loginPersons.stream()
                .sorted(Comparator.comparingInt(a -> a.time))
                .collect(Collectors.toList());

        List<Person> sortedLogOutPerson = logOutPersons.stream()
                .sorted(Comparator.comparingInt(a -> a.time))
                .collect(Collectors.toList());

        for (Person loginPerson : sortedLoginPerson) {


        }
        Map<String, Integer> loginMap = new HashMap<>();
        Map<String, Integer> logoutMap = new HashMap<>();




        return count;
    }

    private static class Person {
        String name;
        int time;
        String log;

        public Person(String name, int time, String log) {
            this.name = name;
            this.time = time;
            this.log = log;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", time=" + time +
                    ", log='" + log + '\'' +
                    '}';
        }
    }
}
