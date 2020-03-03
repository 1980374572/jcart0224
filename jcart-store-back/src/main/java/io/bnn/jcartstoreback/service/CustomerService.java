package io.bnn.jcartstoreback.service;

import io.bnn.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.bnn.jcartstoreback.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

    Customer getByEmail(String email);
}
