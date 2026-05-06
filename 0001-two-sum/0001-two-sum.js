/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let obj={};
    for(let i=0;i<nums.length;i++)
    {
        let a=target-nums[i];
        if(a in obj)
        {
            return [obj[a],i];
        }
        obj[nums[i]]=i;
    }

};