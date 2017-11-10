package com.bamboo.order.dao;

import com.bamboo.order.beans.Order;
import com.bamboo.order.beans.OrderExample;
import com.bamboo.order.dto.QOrder;
import com.bamboo.order.dto.QOrderParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {

    long countByExample(OrderExample example);

    long countByCellPhoneNbr(QOrderParam orderParam);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    List<QOrder> selectByCellPhoneNbr(QOrderParam orderParam);

    Order selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
