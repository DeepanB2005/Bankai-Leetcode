class Solution {
    public boolean isValid(String s) {
        Stack<Character>sk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='['||a=='('||a=='{')
            {
                sk.push(a);
            }
            else
            {
                if(sk.isEmpty())
                {
                    return false;
                }
                else
                {
                    char t=sk.peek();
                    if( t=='[' && a==']' || t=='{' && a=='}' || t=='(' && a==')')
                    {
                        sk.pop();
                    }
                    else{return false;}
                }
            }
        }
        return sk.isEmpty();
    }
}