class MinStack {
    Stack<Integer>st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.pop();
        }
    }

    public int top() {
        if(!st.isEmpty())
        {
            return st.peek();
        }
    return 0;
    }
    
    public int getMin() {
        int m=st.peek();
        for(int i:st)
        {
            m=m<i?m:i;
        }
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */