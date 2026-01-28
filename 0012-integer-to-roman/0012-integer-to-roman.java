class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String>map=new HashMap<>();
        String l[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            while(num>=a[i])
            {
                s.append(l[i]);
                num-=a[i];
            }
        }
        return s.toString();
    }
}