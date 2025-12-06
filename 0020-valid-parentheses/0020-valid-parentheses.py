class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        li=[]
        for i in s:
            if i in ['[','{','(']:
                li.append(i)
            else:
                if len(li)==0:
                    return False
                else:
                    t=li[len(li)-1]
                    if t=='{' and i=='}' or t=='[' and i==']' or t=='(' and i==')':
                        li.pop(len(li)-1)
                    else:
                        return False
        return len(li)==0

        
        