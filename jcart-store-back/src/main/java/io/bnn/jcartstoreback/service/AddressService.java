package io.bnn.jcartstoreback.service;

import io.bnn.jcartstoreback.po.Address;

import java.util.List;

public interface AddressService {
    List<Address> getByCustomerId(Integer customerId);

    void create(Address address);

    Address getById(Integer shipAddressId);

    void update(Address address);

    void delete(Integer addressId);
}
