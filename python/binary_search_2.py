def binary_search(num, arr):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] < num:
            low = mid + 1
        elif arr[mid] > num:
            high = mid - 1
        else:
            return mid
    return None


arr = list(range(5, 20))
num = 0

print(arr)
print(len(arr)-1)

result = binary_search(num, arr)

print(result)

