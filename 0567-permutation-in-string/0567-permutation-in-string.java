class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=s1.length();
        int l=0;
        for(int r=0;r<s2.length();r++){
            char c=s2.charAt(r);
           int val=map.getOrDefault(c,0);
            if(val>0)count--;
            map.put(c,val-1);
            if(count==0){
                return true;
            }
            if(r-l+1==s1.length()){
                char leftc=s2.charAt(l);
                int leftval=map.get(leftc);
                if(leftval>=0)count++;
                map.put(leftc,leftval+1);
                l++;

            }
        }
        return false;
        
    }
}