package io.bnn.jcartstoreback.controller;

import io.bnn.jcartstoreback.dto.in.AddressCreateInDTO;
import io.bnn.jcartstoreback.dto.in.AddressUpdateInDTO;
import io.bnn.jcartstoreback.dto.out.AddressListOutDTO;
import io.bnn.jcartstoreback.po.Address;
import io.bnn.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddressByCustomerId")
    public List<AddressListOutDTO> getAddressByCustomerId(
            @RequestAttribute Integer customerId
    ){
        List<Address> addresses = addressService.getByCustomerId(customerId);

        List<AddressListOutDTO> addressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setTag(address.getTag());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setContent(address.getContent());
            return addressListOutDTO;
        }).collect(Collectors.toList());
        return addressListOutDTOS;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody AddressCreateInDTO addressCreateInDTO,
            @RequestAttribute Integer customerId
    ){
        Address address = new Address();
        address.setCustomerId(customerId);
        address.setTag(addressCreateInDTO.getTag());
        address.setReceiverName(addressCreateInDTO.getReceiverName());
        address.setReceiverMobile(addressCreateInDTO.getReceiverMobile());
        address.setContent(addressCreateInDTO.getContent());

        addressService.create(address);
        Integer addressId = address.getAddressId();
        return addressId;
    }

    @PostMapping("/update")
    public void update(
            @RequestBody AddressUpdateInDTO addressUpdateInDTO,
            @RequestAttribute Integer customerId
    ){
        
    }
}
