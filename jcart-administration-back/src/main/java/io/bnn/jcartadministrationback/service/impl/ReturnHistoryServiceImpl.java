package io.bnn.jcartadministrationback.service.impl;

import io.bnn.jcartadministrationback.dao.ReturnHistoryMapper;
import io.bnn.jcartadministrationback.dao.ReturnMapper;
import io.bnn.jcartadministrationback.po.Return;
import io.bnn.jcartadministrationback.po.ReturnHistory;
import io.bnn.jcartadministrationback.service.ReturnHistoryService;
import io.bnn.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Autowired
    private ReturnService returnService;

    @Override
    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.getListByReturnId(returnId);
        return returnHistories;
    }

    @Override
    @Transactional
    public Long create(ReturnHistory returnHistory) {
        returnHistoryMapper.insertSelective(returnHistory);
        Long returnHistoryId = returnHistory.getReturnHistoryId();

        Return aReturn = new Return();
        aReturn.setReturnId(returnHistory.getReturnId());
        aReturn.setUpdateTime(new Date());
        returnService.update(aReturn);

        return returnHistoryId;
    }
}
