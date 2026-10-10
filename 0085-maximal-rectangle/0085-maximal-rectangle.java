class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[] ans=new int[n];

        int maxi=0;
        for(int i=0;i<m;i++){
            int val=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    
                    ans[j]+=1;
                }
                else{
                   
                    ans[j]=0;;
                }
            }
            maxi=Math.max(maxi,checkforallone(ans));
        }

   return maxi;
    }
    private int checkforallone(int[] ans){
        Stack<Integer>stack=new Stack<>();

        int max=0;
        for(int i=0;i<=ans.length;i++){
            int h=(i==ans.length) ? 0 :ans[i];
            while(!stack.isEmpty() && h<ans[stack.peek()]){

                int val=ans[stack.pop()];
                int len=stack.isEmpty() ? i :i-stack.peek()-1;
                int area=val*len;
                max=Math.max(max,area);
            }
          stack.push(i);

        }
        return max;
    }
}