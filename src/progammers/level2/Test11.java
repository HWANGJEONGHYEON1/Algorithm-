package progammers.level2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 호탤 대실
public class Test11 {
    public static void main(String[] args) {


        //호텔을 운영 중인 코니는 최소한의 객실만을 사용하여 예약 손님들을 받으려고 합니다. 한 번 사용한 객실은 퇴실 시간을 기준으로 10분간 청소를 하고 다음 손님들이 사용할 수 있습니다.
        //예약 시각이 문자열 형태로 담긴 2차원 배열 book_time이 매개변수로 주어질 때, 코니에게 필요한 최소 객실의 수를 return 하는 solution 함수를 완성해주세요.
        //[["15:00", "17:00"], ["16:40", "18:20"], ["14:20", "15:20"], ["14:10", "19:20"], ["18:20", "21:20"]]
        // 3
        System.out.println(solution(new String[][] {
                {"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}
        }));
    }

    public static int solution(String[][] book_time) {
        int answer = 0;

        int[] rooms = new int[1450];

        for (String[] time : book_time) {
            String inTime = time[0];
            String outTime = time[1];
            rooms[calTime(inTime)] += 1;
            rooms[calTime(outTime) + 10] -= 1;
        }

        for (int i = 1; i < 1450; i++) {
            rooms[i] += rooms[i - 1];
            answer = Math.max(answer, rooms[i]);
        }

        return answer;
    }

    private static int calTime(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]) * 60;
        int minute = Integer.parseInt(split[1]);
        return hour+minute;
    }
}
