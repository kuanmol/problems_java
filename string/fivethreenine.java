package string;

import java.util.*;

public class fivethreenine {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }

        List<Integer> minutesList = new ArrayList<>();

        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            minutesList.add(hours * 60 + minutes);
        }

        Collections.sort(minutesList);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < minutesList.size(); i++) {
            minDiff = Math.min(minDiff, minutesList.get(i) - minutesList.get(i - 1));
        }

        int wrapAroundDiff = 1440 - (minutesList.get(minutesList.size() - 1) - minutesList.get(0));
        minDiff = Math.min(minDiff, wrapAroundDiff);

        return minDiff;
    }

    public static void main(String[] args) {
        fivethreenine obj = new fivethreenine();
        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        System.out.println(obj.findMinDifference(timePoints1));

        List<String> timePoints2 = Arrays.asList("00:00", "23:59", "00:00");
        System.out.println(obj.findMinDifference(timePoints2));
    }
}
