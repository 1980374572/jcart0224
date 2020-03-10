package io.bnn.jcartstoreback.service.impl;

import io.bnn.jcartstoreback.dao.ReturnHistoryMapper;
import io.bnn.jcartstoreback.po.ReturnHistory;
import io.bnn.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistoryList = returnHistoryMapper.getByReturnId(returnId);
        return returnHistoryList;
    }
}
