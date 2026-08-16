class Solution:
    def function(self,arr):
        freq = {}
        for num in arr:
            freq[num] = freq.get(num,0)+1

        for num in arr:
            if (freq[num] == 1):
                return num
        return -1

if __name__ == "__main__":
    arr = [1,1,2,2,5,5,6]
    obj = Solution()
    result = obj.function(arr)
    print(result)
        
