package io.bnn.jcartadministrationback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.bnn.jcartadministrationback.dao.OrderDetailMapper;
import io.bnn.jcartadministrationback.dao.OrderMapper;
import io.bnn.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.bnn.jcartadministrationback.dto.out.OrderListOutDTO;
import io.bnn.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.bnn.jcartadministrationback.po.Customer;
import io.bnn.jcartadministrationback.po.Order;
import io.bnn.jcartadministrationback.po.OrderDetail;
import io.bnn.jcartadministrationback.service.CustomerService;
import io.bnn.jcartadministrationback.service.OrderService;
import io.bnn.jcartadministrationback.vo.OrderProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private CustomerService customerService;

    @Override
    public Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<OrderListOutDTO> page = orderMapper.search(
                orderSearchInDTO.getOrderId(),
                orderSearchInDTO.getStatus(),
                orderSearchInDTO.getTotalPrice(),
                orderSearchInDTO.getCustomerName(),
                orderSearchInDTO.getStartTimestamp() == null ? null : new Date(orderSearchInDTO.getStartTimestamp()),
                orderSearchInDTO.getEndTimestamp() == null ? null : new Date(orderSearchInDTO.getEndTimestamp())
        );
        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);

        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());
        Customer customer = customerService.getById(order.getCustomerId());
        orderShowOutDTO.setCustomerName(customer.getRealName());
        orderShowOutDTO.setStatus(order.getStatus());
        orderShowOutDTO.setTotalPrice(order.getTotalPrice());
        orderShowOutDTO.setRewordPoints(order.getRewordPoints());
        orderShowOutDTO.setCreateTimestamp(order.getCreateTime().getTime());
        orderShowOutDTO.setUpdateTimestamp(order.getUpdateTime().getTime());

        orderShowOutDTO.setShipMethod(orderDetail.getShipMethod());
        orderShowOutDTO.setShipAddress(orderDetail.getShipAddress());
        orderShowOutDTO.setShipPrice(orderDetail.getShipPrice());
        orderShowOutDTO.setPayMethod(orderDetail.getPayMethod());
        orderShowOutDTO.setInvoiceAddress(orderDetail.getInvoiceAddress());
        orderShowOutDTO.setInvoicePrice(orderDetail.getInvoicePrice());
        orderShowOutDTO.setComment(orderDetail.getComment());

        List<OrderProductVO> orderProductVOS = JSON.parseArray(orderDetail.getOrderProducts(), OrderProductVO.class);
        orderShowOutDTO.setOrderProducts(orderProductVOS);

        return orderShowOutDTO;
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }
}
