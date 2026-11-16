class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k)
        {
        int t=0;
            for(int j=i;j<i+k && j<s.length();j++)
            {
                t+=s.charAt(j)-'0';
            }
            sb.append(String.valueOf(t));
        }
        return digitSum(sb.toString(),k);
    }
}