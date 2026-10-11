class Solution {
    public int calculate(String s) {
        ArrayList<Integer> nums=new ArrayList<>();
        ArrayList<Character>ops=new ArrayList<>();

        int num=0;
        for(char ch :s.toCharArray()){
            if(ch == ' ') continue;
          
          if(Character.isDigit(ch)){
            num=num*10 + (ch -'0');

          }else{
            nums.add(num);
            ops.add(ch);
            num=0;
          }
         
        
        }
         nums.add(num);

       int result=1;


       for(int i=0;i<ops.size();){

           char c=ops.get(i);
           if(c=='*' || c=='/'){
             int a=nums.get(i);
             int b=nums.get(i+1);
             result = (c=='*') ? a *b : a/b;
             ops.remove(i);
             nums.set(i,result);
             nums.remove(i+1);
           }
           else{
            i++;
           }

       }
       int result2=nums.get(0);

       for(int i=0;i<ops.size();i++){
          
          
           if(ops.get(i)=='+'){
            result2+=nums.get(i+1);
           }
           else{
            result2-=nums.get(i+1);
           }

       }
       return result2;
    }
}