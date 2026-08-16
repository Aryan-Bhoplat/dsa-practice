def function(arr):
    if len(arr) == 0 :
        return
    temp = arr[0]
    for i in range(len(arr)-1):
        arr[i] = arr[i+1]
    arr[len(arr)-1] = temp

arr = [1,2,3,4,5]
print(function(arr))
