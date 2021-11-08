package com.wtu.mapper;

import com.wtu.entity.Bill;
import com.wtu.entity.BillExample;
import java.util.List;

import com.wtu.entity.User;
import org.apache.ibatis.annotations.Param;

public interface BillMapper {
    //查询所有订单
    List<Bill> allBills();

    long countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}