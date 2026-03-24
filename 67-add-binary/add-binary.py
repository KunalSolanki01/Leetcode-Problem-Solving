class Solution:
    def addBinary(self, a: str, b: str) -> str:
        s1 = int(a,2)
        s2 = int(b,2)
        x = s1+s2
        return format(x,'b')