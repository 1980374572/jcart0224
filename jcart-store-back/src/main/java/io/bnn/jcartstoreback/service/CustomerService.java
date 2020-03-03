package io.bnn.jcartstoreback.service;

import io.bnn.jcartstoreback.dto.in.CustomerRegisterInDTO;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);
}
