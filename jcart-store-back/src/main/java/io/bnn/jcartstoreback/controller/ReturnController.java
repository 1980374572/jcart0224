package io.bnn.jcartstoreback.controller;

import io.bnn.jcartstoreback.dto.in.ReturnApplyInDTO;
import io.bnn.jcartstoreback.dto.out.PageOutDTO;
import io.bnn.jcartstoreback.dto.out.ReturnListOutDTO;
import io.bnn.jcartstoreback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @PostMapping("/apply")
    public Integer apply(
            @RequestBody ReturnApplyInDTO returnApplyInDTO,
            @RequestAttribute Integer customerId
    ){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<ReturnListOutDTO> getList(
            @RequestAttribute Integer customerId,
            @RequestParam Integer pageNum
    ){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(
            @RequestParam Integer returnId
    ){
        return null;
    }

}
