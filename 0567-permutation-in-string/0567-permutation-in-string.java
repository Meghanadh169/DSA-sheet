class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int m=s1.length();
         int n=s2.length();
         int[] freq1=new int[26];
         int[] freq2=new int[26];
         int l=0;
         for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
         }
         for(int r=0;r<n;r++){
            char c=s2.charAt(r);
            
            freq2[c-'a']++;
            if(r-l+1>m){
              freq2[s2.charAt(l)-'a']--;
              l++;

            }
            
            if(Arrays.equals(freq1,freq2)){
                return true;
            }


         }
         return false;
    }
}