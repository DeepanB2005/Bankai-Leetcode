class Solution {
    public int calPoints(String[] o) {
        Stack<Integer>st=new Stack<>();
        int m=0;
        for(String i:o)
        {
            if(i.equals("+"))
            {
                int a=st.pop();
                int c=st.peek()+a;
                st.push(a);
                st.push(c);
            }
            else if(i.equals("C"))
            {
                st.pop();
            }
            else if(i.equals("D"))
            {
                st.push(st.peek()*2);
            }
            else
            {
                st.push(Integer.parseInt(i));
            }
        }
        for(int i:st)
        {
            m+=i;
            System.out.println(i);
        }
        return m;
    }
}