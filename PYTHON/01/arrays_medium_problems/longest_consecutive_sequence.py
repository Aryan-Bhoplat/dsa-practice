class Solution:
    def function(self,arr):
        if len(arr) == 0: return 0
        arr = set(arr)
        longest = 1
        for num in arr:
            if num-1 not in arr:
                cnt = 1
                while num+1 in arr:
                    num += 1
                    cnt +=1
                longest = max(longest, cnt)
        return longest

if __name__ == '__main__':
    arr = [100, 4, 200, 1, 3, 2]
    obj = Solution()
    result = obj.function(arr)
    print(result)