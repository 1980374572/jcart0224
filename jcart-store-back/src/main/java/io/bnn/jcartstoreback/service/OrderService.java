package io.bnn.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.bnn.jcartstoreback.dto.out.OrderShowOutDTO;
import io.bnn.jcartstoreback.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
