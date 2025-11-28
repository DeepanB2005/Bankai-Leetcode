class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s1=sorted(s)
        t1=sorted(t)
        return s1==t1
        