package models.somepackage;

import models.OrderStatus;

public class Order {
    int id;
    String productName;
    int quantity;
    OrderStatus orderStatus;

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
