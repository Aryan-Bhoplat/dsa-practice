class Solution:
    def largestElement(self,arr):
        largest = 0
        for i in range(len(arr)):
            if arr[i] > largest:
                largest = arr[i]
        return largest

    def seccond_Largest(self,arr):
        largest = 0
        second = float("-inf")
        for i in range(len(arr)):
            if arr[i] > largest:
                second = largest
                largest = arr[i]
            if arr[i] > second or arr[i] < largest:
                second = arr[i]
        return second

    def check_Sorted_Array(self,arr):
        for i in range(len(arr)+1):
            if arr[i+1] < arr[i]:
                return False
        return True

    def removing_Duplicates(self, arr):
        j = 0
        for i in range(1,len(arr)):
            if arr[j] != arr[i]:
                arr[j+1],arr[i] = arr[i],arr[j+1]
                j+=1
        return arr

    def left_Rotate_ByOne(self, arr):
        first = arr[0]
        for i in range(1,len(arr)):
            arr[i-1] = arr[i]
        arr[-1] = first
        return arr
    
    def right_Rotate_ByOne(self, arr):
        last = arr[-1]
        n = len(arr)
        for i in range(n-2,-1,-1):
            arr[i+1] = arr[i]
        arr[0] = last
        return arr
    
    def reverse(self,arr,start,end):
        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start+=1
            end-=1

    
    def left(self,arr,k):
            n = len(arr)
            k = k % n
            self.reverse(arr,0,k-1)
            self.reverse(arr,k,n-1)
            self.reverse(arr,0,n-1)
            return arr

    def right(self,arr,k):
            n = len(arr)
            k = k % n
            self.reverse(arr,0,n-1)
            self.reverse(arr,0,k-1)
            self.reverse(arr,k,n-1)
            return arr

    def move_Zero(self,arr):
        j = -1
        for i in range(len(arr)):
            if arr[i] == 0:
                j = i
                break
        if j == -1:
            return
        for i in range(j+1,len(arr)):
            if arr[i] != 0:
                arr[i], arr[j] = arr[j], arr[i]
                j+=1
        return arr

    def union_of_arrays(self, arr1, arr2):
        Union = []
        i, j = 0, 0
        n = len(arr1)
        m = len(arr2)

        while i < n and j < m:
            if arr1[i] < arr2[j]:
                if not Union or Union[-1] != arr1[i]:
                    Union.append(arr1[i])
                i+=1
            elif arr2[j] < arr1[i]:
                if not Union or Union[-1] != arr2[j]:
                    Union.append(arr2[j])
                j+=1
            else:
                if not Union or Union[-1] != arr1[i]:
                    Union.append(arr1[i])
                i+=1
                j+=1

        while i < n:
            if not Union or Union[-1] != arr1[i]:
                Union.append(arr1[i])
            i+=1
            
        while j < m:
            if not Union or Union[-1] != arr2[j]:
                Union.append(arr2[j])
            j+=1

        return Union

    def finding_missing_value(self, arr):
        s = []
        for i in arr:
            s.append(i)
        for i in range(1,len(arr)):
            if i not in s:
                return i

        return -1

    def max_consec(self, arr):
        count, maxi = 0, 0

        for i in range(len(arr)):
            if (arr[i] == 1):
                count += 1
            else:
                count = 0
            maxi = max(maxi, count)
        return maxi

    def only_one_occurrence(self, arr):
        xorr = 0
        for i in arr:
            xorr ^= i
        return xorr

    def subarray_with_givenSum(self,arr, k):
        n = len(arr)
        left, sum, maxLen = 0, 0, 0

        for right in range(n):
            sum+= arr[right]

            while sum > k:
                sum -=arr[left]
                left+=1
            if (sum == k):
                maxLen =max(maxLen,right-left+1)

        return maxLen

if __name__ == "__main__":
    arr = [1,4,5,6,2,9]
    obj = Solution()
    result = obj.largestElement(arr)
    print(result)
    result2 = obj.seccond_Largest(arr)
    print(result2)
    result3 = obj.check_Sorted_Array(arr)
    print(result3)
    result4 = obj.removing_Duplicates([1,1,1,1,1,2,2,2,3,3,4])
    print(result4)
    result5 = obj.left_Rotate_ByOne([1,2,3,4,5])
    print(result5)
    result6 = obj.right_Rotate_ByOne([1,2,3,4,5])
    print(result6)
    result7 = obj.right([1,2,3,4,5],2)
    print(result7)
    result8 = obj.left([1,2,3,4,5],3)
    print(result8)
    result9 = obj.move_Zero([1 ,0 ,2 ,3 ,0 ,4 ,0 ,1])
    print(result9)
    result10 = obj.union_of_arrays([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],[2, 3, 4, 4, 5, 11, 12])
    print(result10)
    result11 = obj.finding_missing_value([1,3,4])
    print(result11)
    result12 = obj.max_consec([1,1,1,1,0,1,1,1])
    print(result12)
    result13 = obj.only_one_occurrence([1,1,2,3,3,4,4])
    print(result13)
    result14 = obj.subarray_with_givenSum([10, 5, 2, 7, 1, 9],15)
    print(result14)