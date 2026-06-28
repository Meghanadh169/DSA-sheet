class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Character,Integer>pmap=new HashMap<>();
        for(char ch:p.toCharArray()){
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        int count=p.length();
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            int val=pmap.getOrDefault(ch,0);
            if(val>0)count--;
            pmap.put(ch,val-1);
            if(r-l+1>p.length()){
                char c=s.charAt(l);
                int leftval=pmap.getOrDefault(c,0);
                if(leftval>=0)count++;
                pmap.put(c,leftval+1);
                l++;

            }
            if(count==0){
                list.add(l);
            }


        }
        return list;
        
    }
}