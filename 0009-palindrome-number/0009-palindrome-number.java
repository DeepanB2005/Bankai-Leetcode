class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int o=x;
        while(x>0)
        {
            r=r*10+x%10;
            x/=10;
        }
        return r==o;
    }
}