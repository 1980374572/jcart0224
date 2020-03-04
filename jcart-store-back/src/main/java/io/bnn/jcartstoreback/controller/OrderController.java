package io.bnn.jcartstoreback.controller;


import io.bnn.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.bnn.jcartstoreback.dto.out.OrderListOutDTO;
import io.bnn.jcartstoreback.dto.out.PageOutDTO;
import io.bnn.jcartstoreback.dto.out.ProductShowOutDTO;
import io.bnn.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(
            @RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
            @RequestAttribute Integer customerId
    ){
        Long orderId = orderService.checkout(orderCheckoutInDTO, customerId);
        return orderId;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(
            @RequestAttribute Integer customerId
    ){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(
            @RequestParam Long orderId
    ){
        return null;
    }
}
