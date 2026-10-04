class Solution {
    public int findPeakElement(int[] nums) {
        
         long leftmax=Long.MIN_VALUE;
         
            
        for(int i=0;i<nums.length;i++){
            
             long rightmax= (i==nums.length-1) ? Long.MIN_VALUE :nums[i+1];
           if(nums[i]>leftmax&&nums[i]>rightmax){
                return i;
           }
           else{
            leftmax=nums[i];
           }

        }
        return 0;
    }
}