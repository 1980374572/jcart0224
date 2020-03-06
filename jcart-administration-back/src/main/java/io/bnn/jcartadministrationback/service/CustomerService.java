package io.bnn.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.bnn.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

    Customer getById(Integer customerId);
}
