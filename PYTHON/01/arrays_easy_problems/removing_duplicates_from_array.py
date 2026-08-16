def function(arr):
    check = 0
    for i in range(1,len(arr)):
        if(arr[check] != arr[i]):
            check += 1
            arr[check] = arr[i]
    return arr[:check + 1]

arr = [1,1,2,2,2,3,3]
print(function(arr))