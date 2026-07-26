class Solution {
    public String decodeString(String s) {
        StringBuilder r=new StringBuilder();

        Stack<Integer>ist=new Stack<>();
        Stack<StringBuilder>st=new Stack<>();
        int n=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch>='0' && ch<='9')
            {
                n=n*10+(ch-'0');
            }
            else if(ch=='[')
            {
                ist.push(n);
                st.push(r);
                n=0;
                r=new StringBuilder();
            }
            else if(ch==']')
            {
                StringBuilder c=st.pop();
                int temp=ist.pop();
                for(int j=0;j<temp;j++)
                {
                    c.append(r);
                }
                r=c;
            }
            else
            {
                r.append(ch);
            }
        }
        return r.toString();
    }
}