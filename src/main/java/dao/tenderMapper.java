package dao;

import DO.tender;

public interface tenderMapper {
    int deleteByPrimaryKey(Integer tenderid);

    int insert(tender record);

    int insertSelective(tender record);

    tender selectByPrimaryKey(Integer tenderid);

    int updateByPrimaryKeySelective(tender record);

    int updateByPrimaryKey(tender record);
}