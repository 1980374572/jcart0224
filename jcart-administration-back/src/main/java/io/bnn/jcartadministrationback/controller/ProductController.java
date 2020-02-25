package io.bnn.jcartadministrationback.controller;


import io.bnn.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.bnn.jcartadministrationback.dto.out.PageOutDTO;
import io.bnn.jcartadministrationback.dto.out.ProductListOutDTO;
import io.bnn.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(
            ProductSearchInDTO productSearchInDTO,
            @RequestParam Integer pageNum
    ){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(
            @RequestParam Integer productId
    ){
        return null;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody ProductCreateInDTO productCreateInDTO
    ){
        return null;
    }

    @PostMapping("/update")
    public void update(
            @RequestBody ProductUpdateInDTO productUpdateInDTO
    ){

    }
}
