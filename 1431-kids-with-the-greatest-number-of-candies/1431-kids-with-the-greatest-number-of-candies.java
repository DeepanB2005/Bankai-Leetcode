class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>l=new ArrayList<>();
        int m=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            m=m<candies[i]?candies[i]:m;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=m)
            {
                l.add(true);
            }
            else
            {
                l.add(false);
            }
        }
        return l;
    }
}