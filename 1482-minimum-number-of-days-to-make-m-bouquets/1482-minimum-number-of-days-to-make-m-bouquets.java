class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=1;
        int max=bloomDay[0];
         
        for(int i=0;i<bloomDay.length;i++){

            max=Math.max(max,bloomDay[i]);
        }
        int l=min;
        int r=max;
        int ans=-1;
        while(l<=r){

            int mid=l+(r-l)/2;

            if(findminimumDays(bloomDay,mid,m,k)){
                ans=mid;
                r=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return ans ;
    }
    private boolean findminimumDays(int[] bloomDay,int mid,int m,int k){

        int kcount=0;
        int mcount=0;

        for(int i=0;i<bloomDay.length;i++){

            if(bloomDay[i]<=mid){
                kcount++;
                if(kcount==k){
                    mcount++;
                    kcount=0;
                    
                }
               
            }
            else{
                kcount=0;
            }
           
           
           
        }
         return mcount>=m;
    }
}