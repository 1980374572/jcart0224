package io.bnn.jcartadministrationback.service;

import io.bnn.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.bnn.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getByUsername(String username);

    Administrator getById(Integer administratorId);
}
