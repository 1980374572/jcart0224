package io.bnn.jcartadministrationback.service.impl;

import io.bnn.jcartadministrationback.dao.AddressMapper;
import io.bnn.jcartadministrationback.po.Address;
import io.bnn.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addressList =  addressMapper.getByCustomerId(customerId);
        return addressList;
    }
}
