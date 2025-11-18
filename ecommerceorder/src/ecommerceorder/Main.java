package ecommerceorder;

import ecommerceorder.Order;
import ecommerceorder.OrderLinkedList;

public class Main {
    public static void main(String[] args) {

        OrderLinkedList orderList = new OrderLinkedList();

        // Add orders
        orderList.append(new Order(101, "Alice", "3 × Coffee Mugs"));
        orderList.append(new Order(102, "Bob", "1 × Laptop Stand"));
        orderList.append(new Order(103, "Charlie", "2 × Wireless Keyboards"));

        System.out.println("=== Orders in Original Order ===");
        orderList.display();

        // Reverse list
        orderList.reverse();

        System.out.println("\n=== Orders After Reversal (Most Recent First) ===");
        orderList.display();
    }
}