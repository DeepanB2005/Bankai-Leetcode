class Solution {
    public String longestCommonPrefix(String[] strs) {
        String op=strs[0];
        if(strs.length==0)return "";
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(op)!=0)
            {
                op=op.substring(0,op.length()-1);

            }
        }
        return op;
    }
}