class Solution:
    def function(self, arr):
        nums = {}
        count = 0
        n = len(arr)
        for i in arr:
            if i in nums:
               nums[i] += 1
            else:
               nums[i] = 1

            if nums[i] > n//2:
                return i

        return -1
    '''
    Optimized solution:-

    count, candidate = 0, 0
    for i in arr:
        if count == 0:
            candidate = i

        if i == candidate:
            count+=1
        else:
            count--

    return candidate
    '''

if __name__ == '__main__':
    arr = [7, 0, 7, 0, 1, 7, 7, 2, 7, 7]  
    obj = Solution()
    result = obj.function(arr)
    print(result)