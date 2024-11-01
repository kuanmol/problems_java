package leet;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes the element from the front of queue and returns that element.
    public int pop() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    // Get the front element.
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
