import java.util.Arrays;


public class TheStack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    TheStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new String[stackSize];

        Arrays.fill(stackArray, "-");
    }

    public void push(String input) {
        if(topOfStack+1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
            System.out.println("PUSH " + input + " was added to the stack");
        } else {
            System.out.println("Sorry but the stack is full");
        }
        System.out.println("Stack: " + Arrays.toString(stackArray) + "\n");
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");

        for(int i = 0; i < tempString.length; i++) {
            this.push(tempString[i]);
        }
    }

    public String pop() {
        String result = "";
        if (topOfStack >= 0) {
            result = stackArray[topOfStack];
            System.out.println("POP " + result + " was removed from the stack");
            stackArray[topOfStack--] = "-";
        } else {
            System.out.println("The stack is empty - no value was removed");
        }
        System.out.println("Stack: " + Arrays.toString(stackArray) + "\n");

        return result;
    }

    public void popAll() {
        for(int i = topOfStack; i >= 0; i--) {
            this.pop();
        }
    }

    public String peek() {
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the stack\n");
        return stackArray[topOfStack];
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);

        theStack.push("A");
        theStack.push("B");
        theStack.push("C");
        theStack.push("D");

        theStack.peek();

        theStack.pop();

        theStack.pushMany("E F G H I J");

        theStack.popAll();
    }
}
