package linkedlist;

public class ExecutionNode {
    public static void main(String[] args) {
        Node node = new Node("A");
        node.appendToTail("B");

        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
