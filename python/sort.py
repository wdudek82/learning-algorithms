

class Sort:

    @staticmethod
    def bubble_sort(array):
        for i in reversed(range(len(array))):
            for j in range(0, i):
                if array[j] > array[j+1]:
                    array[j], array[j+1] = array[j+1], array[j]

    @staticmethod
    def selection_sort(array):
        for x in range(len(array)):
            min = x
            for y in range(x+1, len(array)):
                if array[min] > array[y]:
                    min = y
            array[x], array[min] = array[min], array[x]

    @staticmethod
    def insertion_sort(array):
        for i in range(1, len(array)):
            j = i
            to_insert = array[i]

            while j > 0 and to_insert < array[j-1]:
                array[j] = array[j-1]
                j -= 1

            array[j] = to_insert

    @staticmethod
    def merge_sort(array):
        pass


bubble_sort = Sort.bubble_sort
selection_sort = Sort.selection_sort
insertion_sort = Sort.insertion_sort


if __name__ == "__main__":
    from utils import generate_array

    arr = generate_array(6)
    print(arr)
    # bubble_sort(arr)
    # selection_sort(arr)
    insertion_sort(arr)
    print(arr)
