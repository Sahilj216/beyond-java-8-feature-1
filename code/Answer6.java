public class Answer6 {

    public static void main(String[] args) {
        OrderStatuts orderStatus = OrderStatuts.REFUNDED;  
        System.out.println(processingOrderStatus(orderStatus));
    }

    public static String processingOrderStatus(OrderStatuts orderStatus) {
        return switch (orderStatus) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLLED -> "Order has been canceled.";
            case REFUNDED -> {

                String msg = "Refund has been issued for the order.";
                yield msg;
            }
            default -> "Order Status is invalid";
        };
    }
}

enum OrderStatuts {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLLED,
    REFUNDED;
}
