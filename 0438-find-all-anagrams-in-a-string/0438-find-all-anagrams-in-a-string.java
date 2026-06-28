class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> pmap=new HashMap<>();
        for(char ch:p.toCharArray()){
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer>smap=new HashMap<>();
        int count=p.length();
        int l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(pmap.containsKey(c)&&smap.get(c)<=pmap.get(c)){   //expansion phase
                count--;

            } 
            if(r-l+1>p.length()){    //shrinking phase
               char c2=s.charAt(l);
               if(pmap.containsKey(c2)&&smap.get(c2)<=pmap.get(c2)){
                count++;

               }
               smap.put(c2,smap.get(c2)-1);
               l++;
            
            }
            if(count==0){
                list.add(l);

            }
        }
        return list;
    }
}