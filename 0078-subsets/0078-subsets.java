class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        findAllSubSets(0,nums,new ArrayList<>(),list);
         return list;
    }
    private static void findAllSubSets(int i, int[] nums, ArrayList<Integer> ds,List<List<Integer>> list){

        if(i==nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        findAllSubSets(i+1,nums,ds,list);
        ds.remove(ds.size()-1);
        findAllSubSets(i+1,nums,ds,list);

    }
}