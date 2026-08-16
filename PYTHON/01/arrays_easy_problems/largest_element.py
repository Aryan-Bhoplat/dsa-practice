def function(arr):
    max = float('-inf')
    for i in range(len(arr)):
        if(arr[i] > max):
            max = arr[i]
    return max
arr = [2,4,6,3,9,1]
print(f"Max value from array({arr}) is: {function(arr)}")