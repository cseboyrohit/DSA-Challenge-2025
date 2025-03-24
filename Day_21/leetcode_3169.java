import java.util.*;

public class CountDaysWithoutMeetings {
    public static int countDaysWithoutMeetings(int days, int[][] meetings) {
        // Step 1: Sort meetings based on start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Merge overlapping intervals and count busy days
        int busyDays = 0, prevStart = -1, prevEnd = -1;
        
        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            if (start > prevEnd) {
                // Non-overlapping, add the previous meeting duration
                busyDays += (prevEnd - prevStart + 1);
                prevStart = start;
                prevEnd = end;
            } else {
                // Overlapping, merge intervals
                prevEnd = Math.max(prevEnd, end);
            }
        }

        // Add the last merged meeting duration
        busyDays += (prevEnd - prevStart + 1);

        // Step 3: Return total available days minus busy days
        return days - busyDays;
    }

    public static void main(String[] args) {
        int days1 = 10;
        int[][] meetings1 = {{5, 7}, {1, 3}, {9, 10}};
        System.out.println(countDaysWithoutMeetings(days1, meetings1)); // Output: 2

        int days2 = 5;
        int[][] meetings2 = {{2, 4}, {1, 3}};
        System.out.println(countDaysWithoutMeetings(days2, meetings2)); // Output: 1

        int days3 = 6;
        int[][] meetings3 = {{1, 6}};
        System.out.println(countDaysWithoutMeetings(days3, meetings3)); // Output: 0
    }
}
