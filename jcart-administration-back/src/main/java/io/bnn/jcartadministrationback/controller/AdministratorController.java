package io.bnn.jcartadministrationback.controller;

import io.bnn.jcartadministrationback.dto.in.*;
import io.bnn.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.bnn.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.bnn.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.bnn.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
@CrossOrigin
public class AdministratorController {

    @GetMapping("/login")
    public String login(
            AdministratorLoginInDTO administratorLoginInDTO
    ){
        return null;
    }
    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(
            @RequestParam(required = false) Integer adminstratorId
    ){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(
            @RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO
    ){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(
            @RequestParam String email
    ){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(
            @RequestParam Integer pageNum
    ){
        return null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(
            @RequestParam Integer administratorId
    ){
        return null;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody AdministratorCreateInDTO administratorCreateInDT
    ){
        return null;
    }

    @PostMapping("/update")
    public void update(
            @RequestBody AdministratorUpdateInDTO administratorUpdateInDTO
    ){

    }

    @PostMapping("/delete")
    public void delete(
            @RequestBody Integer adminstratorId
    ){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(
            @RequestBody List<Integer> administratorIds
    ){

    }

}
