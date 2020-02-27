package io.bnn.jcartadministrationback.controller;

import io.bnn.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.bnn.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.bnn.jcartadministrationback.dto.out.PageOutDTO;
import io.bnn.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.bnn.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(
            ReturnSearchInDTO returnSearchInDTO,
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

    @PostMapping("/updateAction")
    public void updateAction(
            @RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO
    ){

    }
}
