class MinStack {
   int[] stack;
    int idx;

    public MinStack() {
        stack = new int[30000];
        idx = 0;
    }
    
    public void push(int val) {
        stack [idx] = val;
        idx++;
        
    }
    
    public void pop() {
        idx--;

        
    }
    
    public int top() {

        return stack[idx -1];
    }
    
    public int getMin() {
        int min  = stack[0];

        for(int i = 0; i < idx;i++){
            if(stack[i]<= min)
            min=stack[i];
        }
        return min;
        
    }
}
