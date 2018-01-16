package util;

import DO.tenant;
import dao.daoImpl.tenantDao;
import dao.landlordMapper;
//import org.apache.ibatis.session.SqlSession;

/**
 * Created by zy on 17/5/15.
 */
public class DBTest {

    //调用数据库示例
    public static void main(String[] args){
//        SqlSession sqlSession = DBTools.getSession();
//        landlordMapper landlordMapper = sqlSession.getMapper(dao.landlordMapper.class);
//        landlordMapper.selectByPrimaryKey(1);
        tenant tenant = new tenant(10,"a","1","m","11111111111","","","","");
        tenantDao.registerTenant(tenant);
        tenant = tenantDao.getTenant(1);
        System.out.println(tenant.getName());
    }
}
