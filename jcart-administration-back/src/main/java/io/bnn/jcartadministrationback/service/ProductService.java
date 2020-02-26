package io.bnn.jcartadministrationback.service;


import io.bnn.jcartadministrationback.dto.in.ProductCreateInDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);
}
