package io.bnn.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.bnn.jcartstoreback.po.Return;

public interface ReturnService {
    void create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);
}
