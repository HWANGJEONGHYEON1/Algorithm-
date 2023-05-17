package progammers.level2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

// 주차 요금 계산
public class Test15 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{180, 5000, 10, 600}, new String[]{
                "05:34 5961 IN",
                "06:00 0000 IN",
                "06:34 0000 OUT",
                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",
                "22:59 5961 IN",
                "23:00 5961 OUT"});
        System.out.println(Arrays.toString(solution));

        System.out.println(Duration.between(LocalTime.of(18,59), LocalTime.of(23,59)).toMinutes());
    }

    public static int[] solution(int[] fees, String[] records) {
        List<ParkingCar> parkingCars = new ArrayList<>();
        Map<String, List<String>> collect = Arrays.stream(records)
                .collect(Collectors.groupingBy(record -> record.split(" ")[1]));

        for (String carName : collect.keySet()) {
            ParkingCar parkingCar = new ParkingCar(carName);
            List<String> carInfo = collect.get(carName);
            for (String record : carInfo) {
                String[] parkingInfo = record.split(" ");
                LocalTime time = LocalTime.parse(parkingInfo[0]);
                String parkingInOut = parkingInfo[2];
                parkingCar.addTime(parkingInOut, time);
            }
            parkingCars.add(parkingCar);
        }
        return parkingCars.stream()
                .sorted(Comparator.comparing(p -> Integer.parseInt(p.carNumber)))
                .map(p -> p.totalFee(fees))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static class ParkingCar {
        String carNumber;
        List<LocalTime> inTime = new ArrayList<>();
        List<LocalTime> outTime = new ArrayList<>();

        public ParkingCar(String carNumber) {
            this.carNumber = carNumber;
        }

        public int totalFee(int[] fees) {
            int defaultTime = fees[0];
            int defaultFee = fees[1];
            int unitTime = fees[2];
            int unitFee = fees[3];

            int totalTime = 0;

            if (inTime.size() != outTime.size()) {
                outTime.add(LocalTime.of(23, 59));
            }
            for (int i = 0; i < inTime.size(); i++) {
                totalTime += Duration.between(inTime.get(i), outTime.get(i)).toMinutes();
            }

            int parkingTime = totalTime - defaultTime;
            if (parkingTime > 0) {
                return (int) (defaultFee + (Math.ceil(((double) parkingTime / (double) unitTime)) * unitFee));
            }

            return defaultFee;
        }

        public boolean getInType(String type) {
            return type.equals("IN");
        }

        public void addTime(String parkingInOut, LocalTime time) {
            if (getInType(parkingInOut)) {
                inTime.add(time);
            } else {
                outTime.add(time);
            }
        }
    }
}
