from random import randint


class Utils:

    @staticmethod
    def generate_array(array_size):
        return [randint(0, 99) for _ in range(array_size)]


generate_array = Utils.generate_array


if __name__ == "__main__":
    print(generate_array(5))