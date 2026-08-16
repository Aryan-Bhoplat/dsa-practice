class Solution:
    def function(self,arr):
        posIndex = 0
        negIndex = 1
        result = [0] * len(arr)
        for i in range(len(arr)):
            if(arr[i] < 0):
                result[negIndex] = arr[i]
                negIndex+=2
            else:
                result[posIndex] = arr[i]
                posIndex+=2
        return result

if __name__ == '__main__':
    arr = [1,2,-4,-5]
    obj = Solution()
    result = obj.function(arr)
    print(result)