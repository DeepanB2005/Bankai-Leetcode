class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0 && x!=0)return false;
        int t=0;
        int o=x;
        while(x>0)
        {
            int i=x%10;
            t=t*10+i;
            x=x/10;
        }
        return t==o;
    }
}