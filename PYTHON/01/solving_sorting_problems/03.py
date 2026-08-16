def insertionSort(arr,n):
    for i in range(1,n):
        key = arr[i]
        j = i-1
        while( j >= 0 and arr[j] > key):
            arr[j+1] = arr[j]
            j = j - 1
        arr[j+1] = key

    print("After: ",arr)
arr = [5,3,2,1,4]
print("Before: ",arr)
insertionSort(arr,len(arr))