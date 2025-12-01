class Solution {
    ArrayList<String>list=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        bc("",0,0,n);
        return list;
    }
    private void bc(String st,int op,int cl,int n)
    {
        if(st.length()==n*2)
        {
            list.add(st);
        }
        if(op<n)
        {
            bc(st+'(',op+1,cl,n);
        }
        if(cl<op)
        {
            bc(st+')',op,cl+1,n);
        }
    }    
}