package io.bnn.jcartadministrationback.controller;


import io.bnn.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.bnn.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(
            @RequestParam Long orderId
    ){
        return null;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO
    ){
        return null;
    }
}
