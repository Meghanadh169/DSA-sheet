class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
         combinationsSum2(0,candidates,target,list,new ArrayList<Integer>());                                             
        return list;
    }
    private static void combinationsSum2(int index,int[] arr,int target,List<List<Integer>> list,ArrayList<Integer> ds){

        if(target==0){
            list.add(new ArrayList<Integer>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            combinationsSum2(i+1,arr,target-arr[i],list,ds);
            ds.remove(ds.size()-1);
        }
    }
}