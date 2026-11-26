class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int mini=Integer.MAX_VALUE;
        int[][] dp=new int[n][n];
        findMinFallSum(matrix,dp);
        for(int i = 0; i < n; i++) {
            mini = Math.min(mini, dp[n-1][i]);
        }
       return mini;
    }
    
    private static  void findMinFallSum( int[][] arr,int[][] dp){

        
        
           for(int i1=0;i1<arr.length;i1++){
            dp[0][i1]=arr[0][i1];
           }
      
         for(int m=1;m<arr.length;m++){

            for(int j=0;j<arr.length;j++){
               int up = dp[m-1][j];

                int upright = (j+1 < arr.length)
                    ? dp[m-1][j+1] : Integer.MAX_VALUE;

                int upleft = (j-1 >= 0)
                    ? dp[m-1][j-1] : Integer.MAX_VALUE;

                int minimum = Math.min(up,
                    Math.min(upright, upleft));
                dp[m][j] = arr[m][j] + minimum;
            }
         }
        
    }
    
    // Memoization method this method fails in time wise
    // private static int findMinFallSum(int m,int n,int[][] arr,int[][] dp){

        
    //     if(m<0 || n>=arr.length || n<0) return Integer.MAX_VALUE;
    //       if(m==0) return arr[m][n];
    //     if(dp[m][n] !=-1) return dp[m][n];

    //     int up = findMinFallSum(m-1,n,arr,dp);
    //    int  upright= findMinFallSum(m-1,n+1,arr,dp);
    //     int upleft= findMinFallSum(m-1,n-1,arr,dp);
         
    //     int minimum=Math.min(up,Math.min(upright,upleft));
    //      if(minimum == Integer.MAX_VALUE)
    //         return Integer.MAX_VALUE;
    //     return dp[m][n]=arr[m][n] + minimum;
    // }
}