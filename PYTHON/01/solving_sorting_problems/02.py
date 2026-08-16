def bubble_sort(arr,n):
    for i in range(0,n-1):
        for j in range(0,n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    print("After: ",arr)
arr = [5,3,2,1,4]
print("Before: ",arr)
bubble_sort(arr,len(arr))