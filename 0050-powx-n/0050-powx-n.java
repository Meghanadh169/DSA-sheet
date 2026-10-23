class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        boolean negative=exp<0;
        if(negative){
           
            exp=-exp;
        }
        double ans= check(x,exp,1);

        if(negative){
            return 1.0/ans;
        }
          return ans;
    }

    private double  check(double x,long exp,double ans){

        if(exp==0){
            return ans;
        }
        if((exp & 1 )==1){
            ans*=x;
        }
        return check(x*x,exp/2,ans);
    }
}