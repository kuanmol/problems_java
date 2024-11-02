package extra.face.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        int choice = 0;
        while (choice != -1) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    int popped = stack.pop();
                    System.out.println("Pop: " + popped);
                    break;
                case 3:
                    System.out.println("Top element: " + stack.top());
                    break;
                case 4:
                    System.out.println("Is empty: " + stack.empty());
                    break;
                default:
                    break;
            }
        }
    }
}

class MyStack {


    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int popped = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int peek = q1.poll();
        q2.add(peek);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return peek;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}