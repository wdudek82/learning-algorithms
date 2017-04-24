
public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        }

        return -1;
    }

    public boolean doesArrayContainThisValue(int searchValue) {
        boolean valueInArray = false;

        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if(index < arraySize) {
            for(int i = index; i < (arraySize); i++) {
                theArray[i] = theArray[i+1];
            }

            arraySize--;
        }
    }

    public void insertValue(int value) {
        if(arraySize < 50) {
            arraySize++;
            theArray[arraySize-1] = value;
        }
    }

    public String linearSearchForValue(int value) {
        String indexsWithValue = "";

        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == value) {
                indexsWithValue += "" + i + " ";
            }
        }
        return indexsWithValue;
    }

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();

        System.out.println("At index 3: " + newArray.getValueAtIndex(3));
        System.out.println("Arr contains 18: " + newArray.doesArrayContainThisValue(18));

        newArray.deleteIndex(4);
        newArray.printArray();

        newArray.insertValue(27);
        newArray.printArray();

        System.out.println(newArray.linearSearchForValue(11));
        newArray.printArray();

    } // END OF main
} // END OF ArrayStructures CLASS
