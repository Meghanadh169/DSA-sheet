class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        // Initialize board with '.' ds
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        int[] strightcheck=new int[n];
        int[] downcheck=new int[2 * n -1];
        int[] topcheck=new int[2 * n-1];
        int count=findforallsolutions(0,board,strightcheck,downcheck,topcheck,n);
        return count;
    }
    private static int findforallsolutions(int col,char[][] board,int[] strightcheck,int[] downcheck,int[] topcheck,int n){

       if(col==n){
        return 1;

       }

    int count=0;

        for(int row=0;row<n;row++){
            if(strightcheck[row]==0 &&
            downcheck[row+col]==0 &&
            topcheck[(n-1) + (col-row)]==0){

           board[row][col]='Q';
           strightcheck[row]=1;
           downcheck[row+col]=1;
           topcheck[(n-1) + (col-row)]=1;
          count+= findforallsolutions(col+1,board,strightcheck,downcheck,topcheck,n);
           board[row][col]='.';
           strightcheck[row]=0;
           downcheck[row+col]=0;
           topcheck[(n-1) + (col-row)]=0;

            }
        }
        return count;
    }
}