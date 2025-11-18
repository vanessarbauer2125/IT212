package ecommerceorder;

public class Node {
    public Order order;
    public Node next;

    public Node(Order order) {
        this.order = order;
        this.next = null;
    }
}
