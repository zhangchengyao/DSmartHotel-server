package dao;

import DO.bid;

public interface bidMapper {
    int deleteByPrimaryKey(Integer bidid);

    int insert(bid record);

    int insertSelective(bid record);

    bid selectByPrimaryKey(Integer bidid);

    int updateByPrimaryKeySelective(bid record);

    int updateByPrimaryKey(bid record);
}