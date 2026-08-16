class Solution:
    def function(self,arr,n):
        s = set(arr)
        for i in range(1,n+1):
                if i not in s:
                    return i
                
if __name__ == "__main__":      
    arr = [8, 4, 5, 3, 7,1,2]
    n = len(arr)
    obj = Solution()
    result = obj.function(arr,n)
    print(result)