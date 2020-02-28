package io.bnn.jcartadministrationback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.bnn.jcartadministrationback.constant.ClientExceptionConstant;
import io.bnn.jcartadministrationback.dto.in.*;
import io.bnn.jcartadministrationback.dto.out.*;
import io.bnn.jcartadministrationback.exception.ClientException;
import io.bnn.jcartadministrationback.po.Administrator;
import io.bnn.jcartadministrationback.service.AdministratorService;
import io.bnn.jcartadministrationback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
@CrossOrigin
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/login")
    public AdministratorLoginOutDTO login(
            AdministratorLoginInDTO administratorLoginInDTO
    ) throws ClientException {
        Administrator administrator = administratorService.getByUsername(administratorLoginInDTO.getUsername());
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(administratorLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            AdministratorLoginOutDTO administratorLoginOutDTO = jwtUtil.issueToken(administrator);
            return administratorLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
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

    @GetMapping("/test")
    public String test(){
        String password = "123456";
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        return bcryptHashString;
    }

}
