package ecommerceorder;

public class Order {
    private int orderId;
    private String customerName;
    private String orderDetails;

    public Order(int orderId, String customerName, String orderDetails) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId +
                ", Customer: " + customerName +
                ", Details: " + orderDetails;
    }
}
