package io.bnn.jcartadministrationback.service.impl;

import io.bnn.jcartadministrationback.dao.AdministratorMapper;
import io.bnn.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.bnn.jcartadministrationback.po.Administrator;
import io.bnn.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getByUsername(String username) {
        return administratorMapper.getByUsername(username);
    }
}
