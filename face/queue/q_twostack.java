package face.queue;

import java.util.Scanner;
import java.util.Stack;

public class q_twostack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    q_twostack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        q_twostack queue = new q_twostack();

        int elementsToAdd = scanner.nextInt();
        for (int i = 0; i < elementsToAdd; i++) {
            int element = scanner.nextInt();
            queue.enqueue(element);
        }
        System.out.println();
        queue.display();

        scanner.close();
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new IllegalArgumentException("queue is empty");
        }
        return stack2.pop();
    }

    void display() {
        System.out.println("element in the queue are");
        for (int i = stack2.size(); i > 0; i--) {
            System.out.println(stack2.elementAt(i) + " ");
        }
        for (int i = 0; i < stack1.size(); i++) {
            System.out.println(stack1.elementAt(i) + " ");
        }
        System.out.println();
    }
}
