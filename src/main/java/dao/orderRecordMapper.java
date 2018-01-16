package dao;

import DO.orderRecord;

import java.util.List;

public interface orderRecordMapper {
    int deleteByPrimaryKey(Integer recordid);

    int insert(orderRecord record);

    int insertSelective(orderRecord record);

    orderRecord selectByPrimaryKey(Integer recordid);

    int updateByPrimaryKeySelective(orderRecord record);

    int updateByPrimaryKey(orderRecord record);

    List<orderRecord> getallorder(Integer userid);
}