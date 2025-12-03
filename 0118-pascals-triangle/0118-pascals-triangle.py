class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        List=[]
        for i in range(numRows):
            li=[]
            li.append(1)
            for j in range(1,i):
                li.append(List[i-1][j-1]+List[i-1][j])
            List.append(li)
            if(i>0):
                li.append(1)
        return List
        