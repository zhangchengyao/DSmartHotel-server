package dao;

import DO.tenant;
import org.apache.ibatis.annotations.Param;

public interface tenantMapper {
    int deleteByPrimaryKey(Integer id);

    int insertTenant(tenant record);

    int insertSelective(tenant record);

    tenant selectByPrimaryKey(Integer id);

    tenant selectByNameAndPassword(@Param("tenantname") String tenantname, @Param("password") String password);

    int updateByPrimaryKeySelective(tenant record);

    int updateByPrimaryKey(tenant record);
}