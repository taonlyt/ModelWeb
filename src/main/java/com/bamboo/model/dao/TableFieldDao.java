package com.bamboo.model.dao;

import com.bamboo.model.beans.TableField;
import com.bamboo.model.beans.TableFieldExample;
import com.bamboo.model.beans.TableFieldKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableFieldDao {
    long countByExample(TableFieldExample example);

    int deleteByExample(TableFieldExample example);

    int deleteByPrimaryKey(TableFieldKey key);

    int insert(TableField record);

    int insertSelective(TableField record);

    List<TableField> selectByExample(TableFieldExample example);

    TableField selectByPrimaryKey(TableFieldKey key);

    int updateByExampleSelective(@Param("record") TableField record, @Param("example") TableFieldExample example);

    int updateByExample(@Param("record") TableField record, @Param("example") TableFieldExample example);

    int updateByPrimaryKeySelective(TableField record);

    int updateByPrimaryKey(TableField record);
}