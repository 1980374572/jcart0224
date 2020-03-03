package io.bnn.jcartstoreback.controller;

import io.bnn.jcartstoreback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {

    @GetMapping("/getList")
    public List<OrderHistoryListOutDTO> getList(
            @RequestParam Integer orderId
    ){
        return null;
    }

}
