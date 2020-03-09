package io.bnn.jcartadministrationback.service;


import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.bnn.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.bnn.jcartadministrationback.dto.out.ProductListOutDTO;
import io.bnn.jcartadministrationback.dto.out.ProductShowOutDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum);

    void update(ProductUpdateInDTO productUpdateInDTO);

    ProductShowOutDTO getById(Integer productId);
}
