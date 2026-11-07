class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        findSubSetsWithUnique(0,nums,list,new ArrayList<>());
        return list;

    }
    private static void findSubSetsWithUnique(int index,int[] nums, List<List<Integer>> list,ArrayList<Integer> ds){

    
        list.add(new ArrayList<>(ds));
    


        for(int i=index;i<nums.length;i++){

             if(i!=index&&nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findSubSetsWithUnique(i+1,nums,list,ds);
            ds.remove(ds.size()-1);
        }
    }
}