package linklist;


public class detectloop {
    static Node head;

    public static void main(String[] args) {
        detectloop detectloop = new detectloop();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next = head.next;
        detectloop.detect();
    }
    
    void detect() {
        Node turtle = head, rabbit = head;
        int flag = 0;
        while (turtle != null && rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if (turtle == rabbit) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("loop found");
        } else {
            System.out.println("no loop");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
