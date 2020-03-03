package io.bnn.jcartstoreback.controller;

import io.bnn.jcartstoreback.dto.in.*;
import io.bnn.jcartstoreback.dto.out.CustomerGetProfileOutDTO;
import io.bnn.jcartstoreback.service.CustomerService;
import io.bnn.jcartstoreback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;
import java.util.HashMap;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/register")
    public Integer register(
            @RequestBody CustomerRegisterInDTO customerRegisterInDTO
    ){
        Integer customerId = customerService.register(customerRegisterInDTO);
        return customerId;
    }

    @GetMapping("/login")
    public String login(
            CustomerLoginInDTO customerLoginInDTO
    ){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerGetProfileOutDTO getProfile(
            @RequestAttribute Integer customerId
    ){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(
            @RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
            @RequestAttribute Integer customerId
    ){

    }

    @PostMapping("/changePwd")
    public void changePwd(
            @RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
            @RequestAttribute Integer customerId
    ){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(
            @RequestParam String email
    ){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(
            @RequestBody CustomerResetPwdInDTO customerResetPwdInDTO
    ){

    }
}
