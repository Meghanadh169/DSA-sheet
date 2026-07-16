class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        for(int i=0;i<piles.length;i++){
             max=Math.max(max,piles[i]);
        }

        int l=1;
        int r=max;
        int ans=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(can_eat(piles,h,mid)){
               ans=mid;
               r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
       
    }
   private boolean can_eat(int[] piles,int h,int mid){

    long total=0;
    for(int n:piles){
        total+=(n+mid-1)/mid;

    }
     return total<=h;
   }

}