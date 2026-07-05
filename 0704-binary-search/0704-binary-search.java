class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

          int r1=result(nums,l,r,target);
          return r1;

    }
    public int result(int[] nums,int l,int r,int target){
            if(l>r){
                return -1;

            }
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return result(nums,l,mid-1,target);
            }
               else{
               return  result(nums,mid+1,r,target);
               }
            
        
    }
}