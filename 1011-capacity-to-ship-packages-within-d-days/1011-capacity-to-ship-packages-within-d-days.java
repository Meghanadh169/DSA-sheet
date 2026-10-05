class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=-1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            min=Math.max(min,weights[i]);
            sum+=weights[i];
        }



        int l=min;
        int r=sum;
        int ans=sum;
         while(l<=r){
            int mid=l+(r-l)/2;

            if(calculateCapacity(weights,mid,days)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
         }
         return ans;
    }
    private boolean calculateCapacity(int[] weights,int mid,int days){
         int sum=0;
         int count=1;
        for(int i=0;i<weights.length;i++){
         sum+=weights[i];
         if(sum>mid){
           count++;
           sum=0;
           sum+=weights[i];
         }
        }
        return count<=days;

    }
}