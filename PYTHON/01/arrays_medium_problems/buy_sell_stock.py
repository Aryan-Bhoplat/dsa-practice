class Solution:
    def function(self,arr):
        best = 0
        smallest = float('inf')
        for i in range(len(arr)):
            if arr[i] < smallest:
                smallest = arr[i]

            curr = arr[i] - smallest

            if curr > best:
                best = curr
        return best
"""
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                curr_profit = arr[j] - arr[i]

                if curr_profit > best:
                    best = curr_profit
        return best
"""
            

if __name__ == '__main__':
    arr = [2, 3, 1, 10]
    obj = Solution()
    result = obj.function(arr)
    print(result)