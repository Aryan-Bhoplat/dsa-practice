def selection_sort(arr,n):

    for i in range(0,n-1):
        minIdx = i
        for j in range(i+1,n):
            if arr[j] < arr[minIdx]:
                minIdx = j
        arr[i], arr[minIdx] = arr[minIdx], arr[i]
    print("After: ",arr)

arr = [5,3,2,1,4]
print("Before: ",arr)
selection_sort(arr,len(arr))