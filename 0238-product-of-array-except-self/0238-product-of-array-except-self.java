class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int p=1;
        int z=0;
        for(int i:nums)
        {
            if(i==0)
            {
                z++;
            }
            else
            {
                p*=i;
            }
        }
        System.out.print(p+" "+z);
        for(int i=0;i<nums.length;i++)
        {
            if(z>1)
            {
                if(nums[i]==0)
                {
                    a[i]=0;
                }
            }
            else if(z==1)
            {
                if(nums[i]==0)
                {
                    a[i]=p;
                }
                else
                {
                    a[i]=0;
                }
            }else
            {
                a[i]=p/nums[i];
            }
        }
        return a;
    }
}