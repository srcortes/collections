package linkedlist;

public class Node {
    Node next = null;
    String data;

    public Node(String data) {
        this.data = data;
    }

    public void appendToTail(String data) {
        Node end = new Node(data);
        Node head = this;
        while(head.next != null) {
            head = head.next;
        }
        head.next = end;
    }

    public Node deleteNode(Node head, String data) {
        Node n = head;
        if(n.data.equals(data)) {
            return head.next;
        }

        while (n.next != null) {
            if(n.next.data.equals(data)) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }
}
