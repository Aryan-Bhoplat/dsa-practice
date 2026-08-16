def function(arr):
    if len(arr) <= 1 :
        return
    temp = arr[len(arr)-1]
    for i in range(len(arr)-1,0,-1):
        arr[i] = arr[i-1]
    arr[0] = temp

arr = [1,2,3,4,5]
function(arr)
print(arr)
