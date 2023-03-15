package progammers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Check !
// 캐시
public class Test5 {

    public static void main(String[] args) {
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(new Test5().solution(3, cities));
    }

    // cash hit 1 miss 5
    // LRU
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();

            if (list.contains(cities[i])) {
                list.add(cities[i]);
                list.remove(cities[i]);
                answer += 1;
            } else {
                if (list.size() >= cacheSize) {
                    list.remove(0);
                }
                answer += 5;
                list.add(cities[i]);
            }
        }
        return answer;
    }
}
