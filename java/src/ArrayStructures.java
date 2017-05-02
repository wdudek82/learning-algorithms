
public class ArrayStructures {

    public int[] theArray = new int[50];
    public int arraySize = 10;

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

    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if(j != -1){

            // ADD THE +2 TO FIX SPACING

            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

            System.out.print(j);

        }


        // THEN ADD THIS CODE

        if(i != -1){

            // ADD THE -1 TO FIX SPACING

            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();

    } // END OF printHorzArray METHOD

    public void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void bubbleSort() {
        for(int i = arraySize - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(theArray[j] > theArray[j+1]) {
                    swapValues(j, j+1);
                    this.printHorzArray(i, j);
                }
            }
        }
    } // END OF bubleSort METHOD


    public void binarySearchForValue(int value) {
        int lowInd = 0;
        int highInd = arraySize - 1;

        while(lowInd <= highInd) {
            int middleInd = (highInd + lowInd) / 2;

            if(theArray[middleInd] < value) {
                lowInd = middleInd;
            } else if(theArray[middleInd] > value) {
                highInd = middleInd - 1;
            } else {
                System.out.println("\nFound a match for " + value + " at Index " + middleInd);
                break;
            }

            printHorzArray(middleInd, -1);
        }

    } // END OF binarySearchForValue METHOD


    public void selectionSort() {
        for(int x = 0; x < arraySize; x++) {
            int minimum = x;

            for(int y = x; y < arraySize; y++) {
                if(theArray[minimum] > theArray[y]) {
                    minimum = y;
                }
            }

            swapValues(x, minimum);

            printHorzArray(x, -1);
        }
    } // END OF selectionSort METHOD


    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
//        newArray.printArray();
//
//        System.out.println("At index 3: " + newArray.getValueAtIndex(3));
//        System.out.println("Arr contains 18: " + newArray.doesArrayContainThisValue(18));
//
//        newArray.deleteIndex(4);
//        newArray.printArray();
//
//        newArray.insertValue(27);
//        newArray.printArray();
//
//        System.out.println(newArray.linearSearchForValue(11));
//        newArray.printArray();

//        newArray.bubbleSort();
//        newArray.binarySearchForValue(15);

        newArray.selectionSort();

    } // END OF main
} // END OF ArrayStructures CLASS
