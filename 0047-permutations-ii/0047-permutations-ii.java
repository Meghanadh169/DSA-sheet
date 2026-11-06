class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        back_track(nums,list,new ArrayList<Integer>(),new boolean[nums.length]);
        return list;

    }
    private static void back_track(int[] nums,List<List<Integer>> list,ArrayList<Integer> ds,boolean[] bool){
         
    if(ds.size()==nums.length&& !list.contains(ds)){
        list.add(new ArrayList<>(ds));
        return;
    }


         for(int i=0;i<nums.length;i++){
            if(bool[i]) continue;

            bool[i]=true;
            ds.add(nums[i]);
            back_track(nums,list,ds,bool);
            bool[i]=false;
            ds.remove(ds.size()-1);
         }
    }
}