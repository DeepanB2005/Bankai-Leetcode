class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>l1=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++)
        {
            List<Integer>l2=new ArrayList<>();
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
        return l1.get(rowIndex);
    }
}