package io.bnn.jcartstoreback.service.impl;

import io.bnn.jcartstoreback.dao.AddressMapper;
import io.bnn.jcartstoreback.po.Address;
import io.bnn.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        return addressMapper.selectByCustomerId(customerId);
    }

    @Override
    public void create(Address address) {
        addressMapper.insertSelective(address);
    }
}
