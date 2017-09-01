package com.bamboo.model.dao;

import com.bamboo.model.beans.Table;
import com.bamboo.model.beans.TableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableDao {
    long countByExample(TableExample example);

    int deleteByExample(TableExample example);

    int deleteByPrimaryKey(Integer tableId);

    int insert(Table record);

    int insertSelective(Table record);

    List<Table> selectByExample(TableExample example);

    Table selectByPrimaryKey(Integer tableId);

    int updateByExampleSelective(@Param("record") Table record, @Param("example") TableExample example);

    int updateByExample(@Param("record") Table record, @Param("example") TableExample example);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}