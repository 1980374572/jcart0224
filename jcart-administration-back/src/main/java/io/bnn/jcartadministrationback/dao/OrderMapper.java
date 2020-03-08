package io.bnn.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.bnn.jcartadministrationback.dto.out.OrderListOutDTO;
import io.bnn.jcartadministrationback.po.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Page<OrderListOutDTO> search();
}