package io.bnn.jcartadministrationback.controller;

import io.bnn.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.bnn.jcartadministrationback.dto.out.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(
            OrderSearchInDTO orderSearchInDTO,
            @RequestParam Integer pageNum
    ){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(
            @RequestParam Long orderId
    ){
        return null;
    }

    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(
            @RequestParam Long orderId
    ){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(
            @RequestParam Long orderId
    ){
        return null;
    }

}
