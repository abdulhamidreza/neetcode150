package intervals;

import java.util.Arrays;

public class NonOverlappingIntervals_435 {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = intervals[0][1];
        int count = 1;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                end = interval[1];
                count++;
            }
        }

        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

}
