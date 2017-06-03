import time
from utils import generate_array
from random import randint


def quicksort(array):
    if len(array) < 2:
        return array
    else:
        pivot = array.pop(randint(0, len(array)-1))
        lower = [num for num in array if num <= pivot]
        higher = [num for num in array if num > pivot]
        return quicksort(lower) + [pivot] + quicksort(higher)


def timeit(fun, *args):
    start = time.time()
    result = fun(args)
    stop = time.time()
    return result, '%.10f' % (stop - start)


if __name__ == '__main__':
    arr = generate_array(10)

    print(arr)

    # result = quicksort(arr)
    result = timeit(quicksort, arr)

    print(result)


# O(n)
# O(n)
# O(1)
# O(n^2)