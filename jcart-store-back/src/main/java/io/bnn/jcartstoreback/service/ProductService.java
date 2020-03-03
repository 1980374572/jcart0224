package io.bnn.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartstoreback.dto.out.ProductListOutDTO;
import io.bnn.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {
    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
