class Solution:
    def function(self,arr):
        n = len(arr)
        m = len(arr[0])
        res = [0] * (n*m)
        top, left, k = 0, 0, 0
        bottom, right = n-1,m-1

        while(left <= right and top <= bottom):
            for i in range(left,right+1):
                res[k] = arr[top][i]
                k+=1
            top+=1

            for i in range(top,bottom+1):
                res[k] = arr[i][right]
                k+=1
            right-=1

            if top<= bottom:
                for i in range(right,left-1,-1):
                    res[k] = arr[bottom][i]
                    k+=1
                bottom-=1

            if left <= right:
                for i in range(bottom,top-1,-1):
                    res[k] = arr[i][left]
                    k+=1
                left+=1

        return res
if __name__ == '__main__':
    arr = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]
    obj = Solution()
    result = obj.function(arr)
    print(result)

#[1,2,3,4,8,12,11,10,9,5,6,7]