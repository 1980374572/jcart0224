package io.bnn.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartstoreback.dto.out.ProductListOutDTO;
import io.bnn.jcartstoreback.dto.out.ProductShowOutDTO;
import io.bnn.jcartstoreback.po.Product;

public interface ProductService {
    Page<ProductListOutDTO> search(Integer pageNum);

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);
}
