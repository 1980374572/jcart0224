package io.bnn.jcartadministrationback.service.impl;

import io.bnn.jcartadministrationback.dao.AddressMapper;
import io.bnn.jcartadministrationback.po.Address;
import io.bnn.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}
