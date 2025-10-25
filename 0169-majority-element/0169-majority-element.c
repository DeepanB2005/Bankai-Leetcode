int majorityElement(int* nums, int numsSize) {
    int co=0;
    int can=nums[0];
    for(int i=0;i<numsSize;i++)
    {
        if(co==0)
        {
            can=nums[i];
        }
        if(can==nums[i])
        {
            co++;
        }
        else
        {
            co--;
        }
    }
    return can;
}