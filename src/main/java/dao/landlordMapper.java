package dao;

import DO.landlord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface landlordMapper {
    int deleteByPrimaryKey(Integer landlordid);

    int insert(landlord record);

    int insertSelective(landlord record);

    landlord selectByPrimaryKey(Integer landlordid);

    List<landlord> selectAllLandlord();

    landlord selectByNameAndPassword(@Param("landlordname") String landlordname, @Param("password") String password);

    int updateByPrimaryKeySelective(landlord record);

    int updateByPrimaryKey(landlord record);
}