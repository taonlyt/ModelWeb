package com.bamboo.model.dao;

import com.bamboo.model.beans.TableAttr;
import com.bamboo.model.beans.TableAttrExample;
import com.bamboo.model.beans.TableAttrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableAttrDao {
    long countByExample(TableAttrExample example);

    int deleteByExample(TableAttrExample example);

    int deleteByPrimaryKey(TableAttrKey key);

    int insert(TableAttr record);

    int insertSelective(TableAttr record);

    List<TableAttr> selectByExample(TableAttrExample example);

    TableAttr selectByPrimaryKey(TableAttrKey key);

    int updateByExampleSelective(@Param("record") TableAttr record, @Param("example") TableAttrExample example);

    int updateByExample(@Param("record") TableAttr record, @Param("example") TableAttrExample example);

    int updateByPrimaryKeySelective(TableAttr record);

    int updateByPrimaryKey(TableAttr record);
}