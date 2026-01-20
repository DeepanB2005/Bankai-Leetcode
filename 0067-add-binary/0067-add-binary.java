class Solution {
    public String addBinary(String a, String b) {
        int c=0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||c==1)
        {
            int s=c;
            if(i>=0)
            {
                s+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                s+=b.charAt(j)-'0';
                j--;
            }
            sb.append(s%2);
            c=s/2;
        }
        return sb.reverse().toString();
    }
}