class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        
        int max=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>map=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    if(map.get(ch)>1){
                         
                        break;
                    }
                
            }
            max=Math.max(max,map.size());
        }
        return  max;
    }
}