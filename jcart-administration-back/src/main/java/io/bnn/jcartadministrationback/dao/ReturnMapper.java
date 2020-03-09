package io.bnn.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.po.Return;
import io.bnn.jcartadministrationback.po.ReturnHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);

    Page<Return> search();

}