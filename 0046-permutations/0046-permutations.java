class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ansList=new ArrayList<>();
        permutations(0,nums,ansList);
        return ansList;
    }
    private static void permutations(int index,int[] nums,List<List<Integer>> ansList){
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
             ansList.add(new ArrayList<Integer>(ds));
         return;
        }
       
        for(int i=index;i<nums.length;i++){

            swap(i,nums,index);
            permutations(index+1,nums,ansList);
            swap(i,nums,index);

        }
    }
    private static void  swap(int i,int[] nums,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}