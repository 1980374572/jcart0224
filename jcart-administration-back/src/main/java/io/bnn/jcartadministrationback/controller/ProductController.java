package io.bnn.jcartadministrationback.controller;


import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.bnn.jcartadministrationback.dto.out.PageOutDTO;
import io.bnn.jcartadministrationback.dto.out.ProductListOutDTO;
import io.bnn.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.bnn.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

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
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(
            @RequestBody ProductUpdateInDTO productUpdateInDTO
    ){

    }
}
