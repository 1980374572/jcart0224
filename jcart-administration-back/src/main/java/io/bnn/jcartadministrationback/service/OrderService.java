package io.bnn.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.bnn.jcartadministrationback.dto.out.OrderListOutDTO;
import io.bnn.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.bnn.jcartadministrationback.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
