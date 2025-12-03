class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer>li=new ArrayList<>();
            li.add(1);
            for(int j=1;j<i;j++)
            {
                li.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i>0){
                li.add(1);
            }
            list.add(li);
        }
        return list;
    }
}