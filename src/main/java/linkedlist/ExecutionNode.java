package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExecutionNode {
    public static void main(String[] args) {
        Node node = new Node("A");
        node.appendToTail("B");
        node.appendToTail("C");
        node.appendToTail("B");

        //node = node.deleteNode(node, "C");
        //Eliminate duplicates
        node.getListNodes().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).forEach(i -> node.deleteNode(node, i));
        node.getListNodes().forEach(System.out::println);

        String value = node.getListNodes().get((node.getListNodes().size() - 1) / 2);
        node.deleteNode(node, value);
        System.out.println("After deleting middle element");
        node.getListNodes().forEach(System.out::println);

    }
}
