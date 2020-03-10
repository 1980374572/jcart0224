package io.bnn.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.bnn.jcartstoreback.dao.ReturnMapper;
import io.bnn.jcartstoreback.po.Return;
import io.bnn.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public void create(Return aReturn) {
        returnMapper.insertSelective(aReturn);
    }

    @Override
    public Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> page = returnMapper.getPageByCustomerId(customerId);
        return page;
    }

    @Override
    public Return getById(Integer returnId) {
        Return aReturn = returnMapper.selectByPrimaryKey(returnId);
        return aReturn;
    }
}
