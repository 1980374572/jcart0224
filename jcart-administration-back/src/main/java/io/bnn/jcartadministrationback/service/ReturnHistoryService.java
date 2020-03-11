package io.bnn.jcartadministrationback.service;

import io.bnn.jcartadministrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Long returnId);

    Long create(ReturnHistory returnHistory);
}
