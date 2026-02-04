class Solution {
    public int largestRectangleArea(int[] a) {
        Stack<Integer>st=new Stack<>();
        int m=0;
        int heights[]=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            heights[i]=a[i];
        }
        heights[a.length]=0;
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
            {
                int h=heights[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                m=m<w*h?w*h:m;
            }
            st.push(i);
        }
        return m;
    }
}