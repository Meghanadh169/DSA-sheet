class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private static boolean solve(char[][] board){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]=='.'){

                    for(int k=1;k<=9;k++){
                        if(isValid(board,i,j,k)){
                            board[i][j]=(char)('0'+ k);
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                       
                    }
                     return false;
                }
            }
        }
        return true;
    }
   private static boolean isValid(char[][] board,int i,int j,int k){
     char num=(char)('0'+k);
    for(int n=0;n<9;n++){
     if(board[n][j]==num) return false;
     if(board[i][n]==num) return false;
     if(board[3 * (i/3)+(n/3)][3 * (j/3)+(n%3)]==num) return false;
    }
    return true;
   }
}