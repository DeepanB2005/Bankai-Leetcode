class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int pr[]=new int[nums.length];
        pr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pr[i]=pr[i-1]+nums[i];
        }
        for(int i:pr)
        {
            System.out.print(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int t=pr[i]-k;
            if(pr[i]==k)c++;
            for(int j=0;j<i;j++)
            {
                if(t==pr[j])
                {
                    c++;
                }
            }
        }
        return c;
    }
}