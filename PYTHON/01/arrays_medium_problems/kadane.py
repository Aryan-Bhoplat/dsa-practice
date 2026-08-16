class Solution:
    def function(self,arr):
        maxi = float('-inf')
        prev_sum = 0

        for i in range(len(arr)):
            prev_sum += arr[i]

            if prev_sum > maxi:
                maxi = prev_sum
            if prev_sum < 0:
                prev_sum = 0

        return maxi

if __name__ == '__main__':
    arr = [2, 3, 5, -2, 7, -4]
    obj = Solution()
    result = obj.function(arr)
    print(result)