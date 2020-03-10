package io.bnn.jcartstoreback.service;

import io.bnn.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getByReturnId(Integer returnId);
}
