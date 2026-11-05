class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        boolean[] bool=new boolean[nums.length];
        generateAllPermutations(nums,list,new ArrayList<Integer>(),bool);
        return list;
    }
    private static void generateAllPermutations(int[] nums, List<List<Integer>>list,ArrayList<Integer>ds,boolean[] bool){

        if(ds.size()==nums.length){
            list.add(new ArrayList(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(!bool[i]){
                bool[i]=true;
                ds.add(nums[i]);
                generateAllPermutations(nums,list,ds,bool);
                ds.remove(ds.size()-1);
                bool[i]=false;
            }
        }
    }
}