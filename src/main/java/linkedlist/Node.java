package linkedlist;

public class Node {
    Node next = null;
    String data;

    public Node(String data) {
        this.data = data;
    }

    public void appendToTail(String data) {
        Node end = new Node(data);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
