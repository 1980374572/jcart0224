package io.bnn.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.out.OrderListOutDTO;
import io.bnn.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
