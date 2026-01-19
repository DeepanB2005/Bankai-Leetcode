class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int a[]=new int[nums.length];
        Arrays.fill(a,-1);
        for(int i=0;i<nums.length*2;i++)
        {
            int k=i%nums.length;
            while(!st.isEmpty() && nums[st.peek()]<nums[k])
            {
                a[st.pop()]=nums[k];
            }
            if(k<nums.length)
            {
                st.push(k);
            }
        }
        return a;

    }
}