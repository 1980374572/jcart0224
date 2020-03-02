package io.bnn.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.bnn.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getByUsername(String username);

    Administrator getById(Integer administratorId);

    void update(Administrator administrator);

    Page<Administrator> getList(Integer pageNum);
}
