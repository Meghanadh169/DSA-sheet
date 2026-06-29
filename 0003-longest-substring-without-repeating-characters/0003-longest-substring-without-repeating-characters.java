class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int max=-1;
        if(s.isEmpty())return 0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch)>1){
                 
                char c=s.charAt(l);
                 map.put(c,map.get(c)-1);
                 l++;
                 
                 max=Math.max(max,r-l+1);
            }
            max=Math.max(max,r-l+1);
        }
        return max;
        
    }
}