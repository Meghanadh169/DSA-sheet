class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1;
        int r=10000000;
        int ans=-1;
        if (hour <= dist.length - 1) {
            return -1;
        }

   while(l<=r){
        int mid=l+(r-l)/2;
        if(min_speed(dist,hour,mid)){
           ans=mid;
           r=mid-1;
        }
        else{
            l=mid+1;
        }
    }
    return ans;

    }
   private boolean min_speed(int[] dist,double hour,int mid){
            double t=0.0;
            for(int i=0;i<dist.length;i++){
                if(i!=dist.length-1){
                    t+=Math.ceil((double)dist[i]/mid);
                }
                else{
                    t+=(double)dist[i]/mid;
                }
            }
            return t<=hour;
   }
}