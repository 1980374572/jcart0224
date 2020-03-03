package io.bnn.jcartstoreback.controller;


import io.bnn.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.bnn.jcartstoreback.dto.out.OrderListOutDTO;
import io.bnn.jcartstoreback.dto.out.PageOutDTO;
import io.bnn.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(
            @RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
            @RequestAttribute Integer customerId
    ){
        return null;
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
