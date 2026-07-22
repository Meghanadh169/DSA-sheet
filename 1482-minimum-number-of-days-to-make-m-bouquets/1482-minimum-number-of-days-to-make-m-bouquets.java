class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k)return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int k1:bloomDay){
            min=Math.min(min,k1);
            max=Math.max(max,k1);
        }

       int l=min;
       int r=max;
       int ans=-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(min_days(bloomDay,m,k,mid)==true){
            ans=mid;
            r=mid-1;
        }
        else {
            l=mid+1;
        }
       }
       return ans;
       
        
    }
    private boolean min_days(int[] bloomDay,int m,int k,int min){
            int count=0;
             int b=0;
            for(int j=0;j<bloomDay.length;j++){
                if(bloomDay[j]<=min){
                   count++;
                
                if(count==k){
                  b++;
                  count=0;
                }}
                else{
                    count=0;
                }
            }
            return b>=m;
            

}
}