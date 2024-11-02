package extra.linklist;

public class insert {
    Node head;

    public static void main(String[] args) {
        insert insert = new insert();

        insert.head = new Node(2);
        insert.head.next = new Node(43);
        insert.display();

        System.out.println();

        insert.push(3);
        insert.display();
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
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
