class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list =new ArrayList<>();
        int m=s.length();
        int n=p.length();
        int[] parr=new int[26];
        for(char ch:p.toCharArray()){
            parr[ch-'a']++;
        }
       for(int i=0;i<=m-n;i++){
        int[] sarr=new int[26];
        for(int j=i;j<i+n;j++){
            sarr[s.charAt(j)-'a']++;
        }
        if(Arrays.equals(parr,sarr)){
            list.add(i);
        }
       }
       return list;

        
    }
}