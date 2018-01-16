package dao;

import DO.room;
import org.apache.ibatis.annotations.Param;

public interface roomMapper {
    int deleteByPrimaryKey(Integer roomid);

    int insert(room record);

    int insertSelective(room record);

    room selectByPrimaryKey(Integer roomid);

    room selectByLandlordIdAndRoomType(@Param("landlordId") Integer landlordId, @Param("roomType") String roomType);

    int updateByPrimaryKeySelective(room record);

    int updateByPrimaryKey(room record);
}