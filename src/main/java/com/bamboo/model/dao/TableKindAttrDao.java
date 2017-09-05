package com.bamboo.model.dao;

import com.bamboo.model.beans.TableKindAttr;
import com.bamboo.model.beans.TableKindAttrExample;
import com.bamboo.model.beans.TableKindAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableKindAttrDao {
    long countByExample(TableKindAttrExample example);

    int deleteByExample(TableKindAttrExample example);

    int deleteByPrimaryKey(TableKindAttrKey key);

    int insert(TableKindAttr record);

    int insertSelective(TableKindAttr record);

    List<TableKindAttr> selectByExample(TableKindAttrExample example);

    TableKindAttr selectByPrimaryKey(TableKindAttrKey key);

    int updateByExampleSelective(@Param("record") TableKindAttr record, @Param("example") TableKindAttrExample example);

    int updateByExample(@Param("record") TableKindAttr record, @Param("example") TableKindAttrExample example);

    int updateByPrimaryKeySelective(TableKindAttr record);

    int updateByPrimaryKey(TableKindAttr record);
}