package io.bnn.jcartadministrationback.service;

import io.bnn.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);
}
