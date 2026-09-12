class CustomStack {
         int[] stack;
         int maxsize;
         int index=-1;
    public CustomStack(int maxSize) {
        this.maxsize=maxSize;
        stack=new int[maxsize];
    }
    
    public void push(int x) {
        if(index==maxsize-1){
            return;
        }
        index++;
        stack[index]=x;
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
        int val=stack[index];
        index--;
        return val;

    }
    
    public void increment(int k, int val) {
        int min=Math.min(k,index+1);
        for(int i=0;i<min;i++){
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */