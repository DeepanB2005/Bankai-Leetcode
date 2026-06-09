class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer> l2=new ArrayList<>();
            if(i==0)
            {
                l2.add(1);
            }
            else
            {
                l2.add(1);
                for(int j=1;j<i;j++)
                {
                    l2.add(l1.get(i-1).get(j-1)+l1.get(i-1).get(j));
                }
                l2.add(1);
            }
            l1.add(l2);
        }
        return l1;
    }
}