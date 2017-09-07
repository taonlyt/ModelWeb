package com.bamboo.model.dao;

import com.bamboo.model.beans.TableUpgradeForm;
import com.bamboo.model.beans.TableUpgradeFormExample;
import com.bamboo.model.dto.QTableUpgradeForm;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableUpgradeFormDao {

    long countByExample(TableUpgradeFormExample example);

    int deleteByExample(TableUpgradeFormExample example);

    int deleteByPrimaryKey(Integer upgradeId);

    int insert(TableUpgradeForm record);

    int insertSelective(TableUpgradeForm record);

    List<TableUpgradeForm> selectByExample(TableUpgradeFormExample example);

    TableUpgradeForm selectByPrimaryKey(Integer upgradeId);

    int updateByExampleSelective(@Param("record") TableUpgradeForm record, @Param("example") TableUpgradeFormExample example);

    int updateByExample(@Param("record") TableUpgradeForm record, @Param("example") TableUpgradeFormExample example);

    int updateByPrimaryKeySelective(TableUpgradeForm record);

    int updateByPrimaryKey(TableUpgradeForm record);

    long countByQTableUpgradeForm(QTableUpgradeForm params);

    List<TableUpgradeForm> selectByQTableUpgradeForm(QTableUpgradeForm params);

}
