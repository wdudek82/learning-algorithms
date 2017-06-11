from .sort import bubble_sort
from .utils import generate_array


def binary_search(value, array):
    low, high = 0, len(array)-1

    while low <= high:
        middle = (low + high) // 2
        if array[middle] < value:
            low = middle + 1
        elif array[middle] > value:
            high = middle - 1
        else:
            return f"Found match for {value} at index: {middle}"
    return f"Value {value} was not found"


if __name__ == "__main__":

    arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(arr)
    print(binary_search(9, arr))