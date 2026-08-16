class Solution:
    def kadane(self,nums):
        maxi = float('-inf')
        sum = 0
        for i in range(len(nums)):
            sum += nums[i]
            if sum > maxi:
                maxi = sum
            if sum < 0:
                sum = 0
        return maxi
    
if __name__ == '__main__':
    arr = [ -3,-2,-2,-3]
    obj = Solution()
    result = obj.kadane(arr)
    print(result)