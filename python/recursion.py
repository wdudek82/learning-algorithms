from utils import generate_array


def countdown(i):
    print(i)

    if i < 1:
        return
    else:
        countdown(i-1)


# countdown(3)


def greet(name):
    print("hello, %s" % name)

    greet2(name)
    print("getting ready to say bye...")
    bye()


def greet2(name):
    print("how are you, %s?" % name)


def bye():
    print("ok, bye!")


# greet("neevor")


# def summ_array(array, total=0):
#     if array:
#         return summ_array(array, total+array.pop())
#     else:
#         return total

# Implemented with Divide & Conquer technique
def summ_array2(array):
    if len(array) >= 2:
        return array[0] + summ_array2(array[1:])
    elif len(array) == 1:
        return array[0]
    else:
        return 0

# result = summ_array2([1, 2, 3, 4, 5])
# print("result: ", result)


# Count numbers in array using D&C technique
def count_items(array):
    l = len(array)
    if l == 0:
        return 0
    elif l == 1:
        return 1
    else:
        return 1 + count_items(array[1:])

# result = count_items([1, 1, 2, 3, 4, 2, 1])
# print("result: ", result)


# Find the maximum number in a list using D&C
def biggest(array):
    l = len(array)
    if l == 0:
        return None
    elif l == 1:
        return array[0]
    else:
        head = array[0]
        tail = biggest(array[1:])
        return head if head > tail else tail

# result = biggest([1, 2, 3, 7, 4, 5])
# print("result: ", result)


# Implement recursive version of Binary Search
# TODO: Fix. This.
def binary_search(searched, array):
    l = len(array)
    if l == 0:
        return None
    elif l == 1:
        return 0
    else:
        middle = l // 2
        low = array[0:middle]
        high = array[middle+1:]
        if array[middle] > searched:
            return binary_search(searched, low)
        elif array[middle] < searched:
            return binary_search(searched, high)
        else:
            print(array[middle])
            return array[middle]


# Iterative Binary Search
def iter_binary_search(search, array):
    low, high = 0, len(array) - 1

    while low <= high:
        mid = (low + high) // 2
        if array[mid] > search:
            high = mid - 1
        elif array[mid] < search:
            low = mid + 1
        else:
            return mid
    return -1


arr = [1, 5, 9, 12, 24]
# result = binary_search(0, arr)
# print("result: ", result)

result = iter_binary_search(0, arr)
print(result)