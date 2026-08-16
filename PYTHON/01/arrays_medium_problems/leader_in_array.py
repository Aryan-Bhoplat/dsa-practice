class Solution:
    def function(self,arr):
        res = []
        n = len(arr)
        max = arr[n-1]
        res.append(max)
        for i in range(n-2,0,-1):
            if arr[i] > max:
                res.append(arr[i])
                max = arr[i]
        res.reverse()
        return res

if __name__ == '__main__':
    arr = [10, 22, 12, 3, 0, 6]
    obj = Solution()
    result = obj.function(arr)
    print(result)