package io.bnn.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);
}
