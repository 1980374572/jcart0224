package io.bnn.jcartadministrationback.service.impl;

import io.bnn.jcartadministrationback.dao.OrderHistoryMapper;
import io.bnn.jcartadministrationback.po.OrderHistory;
import io.bnn.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.getByOrderId(orderId);
        return orderHistories;
    }
}
