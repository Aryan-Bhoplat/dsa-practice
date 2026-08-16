def function(arr):
    max = arr[0]
    second = float('-inf')
    for i in range(len(arr)):
        if(arr[i] > max):
            second = max
            max = arr[i]
        if(arr[i] > second and arr[i] < max):
            second = arr[i]
    return second

arr = [12, 45, 7, 23, 45, 19]
print("Second Largest Element: ",function(arr))