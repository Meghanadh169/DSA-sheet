class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>anslist=new ArrayList<>();
        Arrays.sort(nums);
        generateAllsubsets(0,nums,new ArrayList<Integer>(),anslist);
        return anslist;
    }
    private static void generateAllsubsets(int start,int[] nums,ArrayList<Integer> ds, List<List<Integer>> anslist){
         anslist.add(new ArrayList<Integer>(ds));

         for(int i=start;i<nums.length;i++){
            if(i!=start && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
             generateAllsubsets(i+1,nums,ds,anslist);
             ds.remove(ds.size()-1);
         }
    }
}