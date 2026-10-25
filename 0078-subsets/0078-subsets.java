class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer>current=new ArrayList<>();
         printAllSubSet(0,nums,current,list);
         return list;
    }
    private void printAllSubSet(int i,int[] nums,ArrayList<Integer> current,List<List<Integer>> list){
        int n=nums.length;
        if(i==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        printAllSubSet(i + 1, nums, current, list);
        current.remove(current.size() - 1);
         printAllSubSet(i + 1, nums, current, list);

    }
}