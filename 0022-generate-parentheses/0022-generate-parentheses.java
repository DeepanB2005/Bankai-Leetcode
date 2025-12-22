class Solution {
    List<String>li=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        bc("",0,0,n);
        return li;
    }
    public void bc(String s,int o,int c,int n)
    {

        if(s.length()==n*2)
        {
            li.add(s);
        }
        if(o<n)
        {
            bc(s+"(",o+1,c,n);
        }
        if(c<o)
        {
            bc(s+")",o,c+1,n);
        }
    }
}