class Solution:
    def sort012(self,arr):
        low = 0
        high = len(arr)-1
        mid = 0

        while mid <= high:
            if arr[mid] == 0:
                arr[mid], arr[low] = arr[low], arr[mid]
                low+=1
                mid+=1
            elif arr[mid] == 1:
                mid += 1
            else:
                arr[mid], arr[high] = arr[high], arr[mid]
                high -=1
        return arr

if __name__ == '__main__':
    arr = [2,1,0,1,2]
    obj = Solution()
    result = obj.sort012(arr)
    print(result)