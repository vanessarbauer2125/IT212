import static org.junit.jupiter.api.Assertions.*;

import ecommerceorder.Order;
import ecommerceorder.OrderLinkedList;
import org.junit.jupiter.api.Test;

public class OrderLinkedListTest {

    @Test
    void append_whenAddingTwoOrders_shouldLinkThemInOrder() {
        OrderLinkedList list = new OrderLinkedList();

        list.append(new Order(1, "Alice", "Item A"));
        list.append(new Order(2, "Bob", "Item B"));

        assertEquals(1, list.getHead().order.getOrderId());
        assertEquals(2, list.getHead().next.order.getOrderId());
    }

    @Test
    void reverse_whenListHasOneElement_shouldRemainUnchanged() {
        OrderLinkedList list = new OrderLinkedList();
        list.append(new Order(10, "Solo", "One item"));

        list.reverse();

        assertEquals(10, list.getHead().order.getOrderId());
        assertNull(list.getHead().next);
    }

    @Test
    void reverse_whenListHasMultipleElements_shouldReverseOrder() {
        OrderLinkedList list = new OrderLinkedList();

        list.append(new Order(101, "Alice", "A"));
        list.append(new Order(102, "Bob", "B"));
        list.append(new Order(103, "Charlie", "C"));

        list.reverse();

        assertEquals(103, list.getHead().order.getOrderId());
        assertEquals(102, list.getHead().next.order.getOrderId());
        assertEquals(101, list.getHead().next.next.order.getOrderId());
    }

    @Test
    void reverse_whenListIsEmpty_shouldKeepHeadNull() {
        OrderLinkedList list = new OrderLinkedList();

        list.reverse();

        assertNull(list.getHead());
    }
}
