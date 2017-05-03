import java.util.Arrays;


import java.util.Arrays;


public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    TheQueue(int size) {
        this.queueSize = size;
        this.queueArray = new String[size];

        Arrays.fill(queueArray, "-");
    }

    public void insert(String input) {
        if(numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;

            System.out.println("INSERT " + input + " was added to the queue");
        } else {
            System.out.println("Sorry but the queue is full");
        }
    }

    public void remove() {
        if(numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray + " was removed");
            queueArray[front] = "-";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry but the queue is empty");
        }
    }

    public void peek() {
        System.out.println("The first element is " + queueArray[front]);
    }

    public void priorityInsert(String input) {
        int i;

        if(numberOfItems == 0) {
            insert(input);
        } else {
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else {
                    break;
                }
            }

            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(5);
        theQueue.insert("A");
        theQueue.insert("B");
        theQueue.insert("C");
        theQueue.insert("D");
        theQueue.insert("E");

        System.out.println("The queue: " + Arrays.toString(theQueue.queueArray));
        theQueue.remove();
    }
}
