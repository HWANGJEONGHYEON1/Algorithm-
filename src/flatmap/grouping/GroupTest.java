package flatmap.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTest {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("Dave", 30),
                new Person("Eve", 25)
        );

        // 나이(age)를 기준으로 그룹화하여 맵으로 반환

        Map<Integer, List<Person>> collect = persons.stream()
                .collect(Collectors.groupingBy(person -> person.age));
        System.out.println(collect);

        // 나이를 기준으로 그룹화하여 맵으로 반환하고, 그룹화된 요소들의 평균 나이를 계산하기
        Map<Integer, Double> collect2 = persons.stream()
                .collect(Collectors.groupingBy(person -> person.age, Collectors.averagingDouble(person -> person.age)));
        System.out.println(collect2);

        // 문자열 리스트 생성
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // 문자열 길이를 기준으로 그룹화하여 맵으로 반환
        Map<Integer, List<String>> collect1 = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect1);
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
