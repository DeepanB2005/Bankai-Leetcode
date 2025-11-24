class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        a=[]
        w=s.split()
        for i in w:
            a.append(i[::-1])
        return " ".join(a)
            


        


        