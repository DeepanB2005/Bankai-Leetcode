class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> op =new ArrayList<>();
        Arrays.sort(arr);
        int m=123456789;
        for(int i=0;i<arr.length-1;i++)
        {
            int c=arr[i+1]-arr[i];
            if(c<m)
            {
                op.clear();
                m=c;
            }
            if(m==c)
            {
                ArrayList<Integer>tl=new ArrayList<>();
                tl.add(arr[i]);
                tl.add(arr[i+1]);
                op.add(tl);
            }
        }
        return op;
    }
}