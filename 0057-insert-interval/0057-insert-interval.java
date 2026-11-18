
import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        // Part 1: Intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Part 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(
                newInterval[0], intervals[i][0]);

            newInterval[1] = Math.max(
                newInterval[1], intervals[i][1]);

            i++;
        }

        // Add merged interval
        ans.add(newInterval);

        // Part 3: Intervals after newInterval
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
