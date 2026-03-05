bool isValid(char* s) {
    char a[strlen(s)];
    int j=0;
    for(int i=0;i<strlen(s);i++)
    {
        if(s[i]=='(' || s[i]=='{' || s[i]=='[')
        {
            a[j++]=s[i];
        }
        else
        {
            if(j==0)return false;
            int k=j-1;
            if(s[i]=='}' && a[k]=='{' || s[i]==']' && a[k]=='[' || s[i]==')' && a[k]=='(')
            {
                j--;
            }else
            {
                return false;
            }
        }
    }
    return j==0;
}