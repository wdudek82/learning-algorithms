#!/usr/bin/env bash
import logging


logging.basicConfig(level=logging.DEBUG, format=' %(asctime)s - %(levelname)s - %(message)s')

# Insertion sort
def insertion_sort(arr):
    logging.debug('Start: {}'.format(arr))
    for i in range(len(arr)):
        j = i
        logging.debug('Step {}:{}, result: {}'.format(i, j, arr))
        while j > 0 and arr[j-1] > arr[j]:
            arr[j-1], arr[j] = arr[j], arr[j-1]
            j -= 1
            logging.debug('Step {}:{}, result: {}'.format(i, j, arr))
    return arr

# Reversed Insertion sort
def r_insertion_sort(arr):
    logging.debug('Start: {}'.format(arr))
    for i in range(len(arr)):
        j = i
        logging.debug('Step {}:{}, result: {}'.format(i, j, arr))
        while j > 0 and arr[j-1] < arr[j]:
            arr[j-1], arr[j] = arr[j], arr[j-1]
            j -= 1
            logging.debug('Step {}:{}, result: {}'.format(i, j, arr))
    return arr

# Linear Search
def linear_search(arr, v):
    for ind, item in enumerate(arr):
        if item == v:
            return ind
    return None


arr = [4,7,1,3,5,2,8,6]

# result = insertion_sort(arr)
# result = r_insertion_sort(arr)

# print(result)
print(linear_search(arr, -5))


