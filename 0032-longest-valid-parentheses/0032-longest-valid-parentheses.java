class Solution {
    public int longestValidParentheses(String s) {
        int l=0;
        int r=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                r++;
            }
            else{
                l++;
            }
            if(r>l){
                l=r=0;
            }
            if(r==l){
             max=Math.max(max,r*2);
            }
        }

        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
             if(ch==')'){
                r++;
            }
            else{
                l++;
            }
            if(r<l){
                l=r=0;
            }
            if(r==l){
             max=Math.max(max,r*2);
            }
        }
        return max;
    }
}