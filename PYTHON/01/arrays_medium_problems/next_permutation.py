class Solution:
    def function(self,arr):
        end = len(arr)-1
        pivot = -1

        for i in range(end,0,-1):
            if arr[i] > arr[i-1]:
                pivot = i-1
                break

        if pivot == -1:
            start = 0
            while start < end:
                arr[start], arr[end] = arr[end], arr[start]

                start+=1
                end-=1
        else:
            for i in range(end,0,-1):
                if arr[i] > arr[pivot]:
                    arr[i], arr[pivot] = arr[pivot], arr[i]
                    break
            while pivot < end:
                arr[pivot+1], arr[end] = arr[end], arr[pivot+1]
                pivot+=1
                end-=1
        return arr

if __name__ == '__main__':
    arr = [3,2,1]
    obj = Solution()
    result = obj.function(arr)
    print(result)