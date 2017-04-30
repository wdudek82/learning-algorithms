
public class ElementarySortingAlgorithms extends ArrayStructures {

    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();

        ElementarySortingAlgorithms sortTest = new ElementarySortingAlgorithms();
        sortTest.bubleSort();
    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void bubleSort() {
        for(int i = arraySize - 1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if(theArray[j] > theArray[j+1]) {
                    swapValues(j, j+1);
//                    printHorizontaly();

                }
            }
        }
    } // END OF bubleSort METHOD

    public void binarySearchForValue(int value) {

    } // END OF binarySearchForValue METHOD

    public void selectionSort() {

    } // END OF selectionSort METHOD

} // END OF ElementarySortingAlgorithms CLASS
