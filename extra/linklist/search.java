package extra.linklist;

public class search {

    static Node head;

    public static void main(String[] args) {
        search search = new search();
        head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(43);
        search.display();
        System.out.println();
        if (search.search(33, head)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public boolean search(int data, Node node) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
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


