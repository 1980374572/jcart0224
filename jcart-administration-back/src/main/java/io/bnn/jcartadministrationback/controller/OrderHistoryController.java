package io.bnn.jcartadministrationback.controller;


import com.sun.org.apache.xpath.internal.operations.Or;
import io.bnn.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.bnn.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import io.bnn.jcartadministrationback.po.OrderHistory;
import io.bnn.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(
            @RequestParam Long orderId
    ){
        List<OrderHistory> orderHistories = orderHistoryService.getByOrderId(orderId);

        List<OrderHistoryListOutDTO> orderHistoryListOutDTOS = orderHistories.stream().map(orderHistory -> {
            OrderHistoryListOutDTO orderHistoryListOutDTO = new OrderHistoryListOutDTO();
            orderHistoryListOutDTO.setOrderHistoryId(orderHistory.getOrderHistoryId());
            orderHistoryListOutDTO.setTimestamp(orderHistory.getTime().getTime());
            orderHistoryListOutDTO.setOrderStatus(orderHistory.getOrderStatus());
            orderHistoryListOutDTO.setComment(orderHistory.getComment());
            orderHistoryListOutDTO.setCustomerNotified(orderHistory.getCustomerNotified());
            return orderHistoryListOutDTO;
        }).collect(Collectors.toList());
        return orderHistoryListOutDTOS;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO
    ){
        return null;
    }
}
