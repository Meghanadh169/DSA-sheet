class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();



        for(int i=0;i<asteroids.length;i++){
            int a =asteroids[i];

            while(!stack.isEmpty()&& stack.peek() >0 && a<0 && stack.peek()<-a){
                stack.pop();
            }
            if(!stack.isEmpty() && a<0 && stack.peek() >0){
                if(stack.peek() == -a){
                    stack.pop();
                }
            }
            else{
                stack.push(a);
            }
        }
        int[] ans=new int[stack.size()];

        for(int i=stack.size()-1 ; i>=0;i--){
  
          ans[i]=stack.pop();


        }
        return ans;
    }
}