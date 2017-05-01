#!/usr/bin/env bash


class Sort:

    @staticmethod
    def bubble_sort(array):
        for i in reversed(range(len(array))):
            for j in range(0, i):
                if array[j] > array[j+1]:
                    array[j], array[j+1] = array[j+1], array[j]

    @staticmethod
    def merge_sort(array):
        pass

    @staticmethod
    def insert_sort(array):
        pass


bubble_sort = Sort.bubble_sort


if __name__ == "__main__":
    from utils import generate_array

    arr = generate_array(6)
    print(arr)
    Sort.bubble_sort(arr)
    print(arr)
