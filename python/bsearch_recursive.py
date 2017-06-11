def bsearch_recursive(num, arr):
    length = len(arr)
    mid = length // 2
    new_arr = arr;

    if arr[mid] < num:
        new_arr = arr[mid+1:]
        return bsearch_recursive(num, new_arr)
    elif arr[mid] > num:
        new_arr = arr[0:mid]
        return bsearch_recursive(num, new_arr)
    else:
        return mid


if __name__ == '__main__':
    array = list(range(1, 21))
    print(array)

    result = bsearch_recursive(5, array)
    print(result)

