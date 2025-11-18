package ecommerceorder;

public class OrderLinkedList {
    private Node head;

    public OrderLinkedList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    // Append an order to the end
    public void append(Order order) {
        Node newNode = new Node(order);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display all orders
    public void display() {
        if (head == null) {
            System.out.println("No orders in the list.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.order);
            current = current.next;
        }
    }

    // Reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }
}
