#!/usr/bin/env bash
from sort import bubble_sort
from utils import generate_array


def binary_search(value, array):
    low, high = 0, len(array)-1

    if value in array:
        while low <= high:
            middle = (low + high) // 2
            if array[middle] < value:
                low = middle + 1
            elif array[middle] > value:
                high = middle - 1
            else:
                print(f"Found match for {value} at index: {middle}")
                low = high + 1
    else:
        print(f"Value {value} is not present in the array")


if __name__ == "__main__":

    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(arr)
    binary_search(11, arr)