class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(!st.isEmpty() && tokens[i].equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int t=a+b;
                st.push(t);
            }
            else if(!st.isEmpty() && tokens[i].equals("-"))
            {                
                int a=st.pop();
                int b=st.pop();
                int t=b-a;
                st.push(t);
            }
            else if(!st.isEmpty() && tokens[i].equals("*"))
            {
                int a=st.pop();
                int b=st.pop();
                int t=a*b;
                st.push(t);
            }
            else if(!st.isEmpty() && tokens[i].equals("/"))
            {
                int a=st.pop();
                int b=st.pop();
                int t=b/a;
                st.push(t);
            }
            else
            {
            st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}