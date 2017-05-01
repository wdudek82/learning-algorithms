#!/usr/bin/env bash


def bubble_sort(array):
    for i in reversed(range(len(array))):
        for j in range(0, i):
            if array[j] > array[j+1]:
                array[j+1], array[j] = array[j], array[j+1]


arr = [3, 6, 1, 7, 9, 3, 6, 5]
bubble_sort(arr)
print(arr)