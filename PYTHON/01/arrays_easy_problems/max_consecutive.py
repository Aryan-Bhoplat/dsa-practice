class Solution:
    def function(self, arr):
        count, maxi = 0, 0
        for i in range(0,len(arr)):
            if arr[i] == 1:
                count+=1
            elif arr[i] == 0:
                count = 0
            if count > maxi:
                maxi = count
        return maxi

if __name__ == "__main__":
    arr = [1,1,1,1,0,1,1,1]
    obj = Solution()
    result = obj.function(arr)
    print(result)