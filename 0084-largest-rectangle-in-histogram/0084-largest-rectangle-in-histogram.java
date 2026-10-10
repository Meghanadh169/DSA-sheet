class Solution {
    public int largestRectangleArea(int[] heights) {

        int n=heights.length;
        int max=0;
   Stack<Integer>stack=new Stack<>();
        for(int i=0;i<=n;i++){
             int h= (i==n) ?0 :heights[i];
      while(!stack.isEmpty() && h<heights[stack.peek()]){
           int val=heights[stack.pop()];
           int width;
           if(stack.isEmpty()){
            width=i;
           }
           else{
            width=i-stack.peek()-1;
           }
           int area=width*val;
           max=Math.max(max,area);
      }


          stack.push(i);
        }
        return max;
    }
}