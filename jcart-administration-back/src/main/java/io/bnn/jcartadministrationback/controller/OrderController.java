package io.bnn.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.bnn.jcartadministrationback.dto.out.*;
import io.bnn.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(
            OrderSearchInDTO orderSearchInDTO,
            @RequestParam(required = false,defaultValue = "1") Integer pageNum
    ){
        Page<OrderListOutDTO> page = orderService.search(pageNum);
        PageOutDTO pageOutDTO = new PageOutDTO();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(
            @RequestParam Long orderId
    ){
        OrderShowOutDTO orderShowOutDTO = orderService.getById(orderId);
        return orderShowOutDTO;
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
