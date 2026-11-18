class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int n=intervals.length;
        int count=1;
        int last=intervals[0][1];
        for(int i=1;i<n;i++){
            int a=intervals[i][0];

            if(a>=last){
                count++;
                last=intervals[i][1];
            }
            
        }
        return n-count;

    }
}