class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        li=[]
        def bc(s,o,c):
            if(len(s)==n*2):
                li.append(s)
                return
            if(o<n):
                bc(s+'(',o+1,c)
            if(c<o):
                bc(s+')',o,c+1)
        bc("",0,0)
        return li
