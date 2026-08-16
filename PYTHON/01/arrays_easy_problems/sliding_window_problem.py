class Solution:
    def function(self, arr, k):
        sum, left, maxLen = 0, 0, 0

        for right in range(len(arr)):
            sum += arr[right]

            while(sum > k):
                sum -= arr[left]
                left+=1


            if(sum == k):
                maxLen = max(maxLen,(right-left)+1)

        return maxLen

if __name__ == "__main__":
    arr = [1,2,3,1,1,1]
    obj = Solution()
    result = obj.function(arr,3)
    print(result)   