package dao.daoImpl;

import DO.bid;
import DO.orderRecord;
import DO.tenant;
import dao.bidMapper;
import dao.orderRecordMapper;
import dao.tenantMapper;
import org.apache.ibatis.session.SqlSession;
import util.DBTools;

import java.util.List;

/**
 * Created by sam on 2017/5/28.
 */
public class tenantDao {

    public static List<orderRecord> getrecords(int tenantId){
        SqlSession sqlSession = DBTools.getSession();
        orderRecordMapper recordMapper = sqlSession.getMapper(dao.orderRecordMapper.class);
        List<orderRecord> allrecord = recordMapper.getallorder(tenantId);
        return allrecord;
    }
    public static boolean saveBid(bid result){
        SqlSession sqlSession = DBTools.getSession();
        bidMapper bids = sqlSession.getMapper(dao.bidMapper.class);
        bids.insert(result);
        return true;
    }
    public static tenant getTenant(int tenantId){
        SqlSession sqlSession = DBTools.getSession();
        tenantMapper mapper = sqlSession.getMapper(dao.tenantMapper.class);
        tenant user = mapper.selectByPrimaryKey(tenantId);
        return user;
    }
    public static boolean registerTenant(tenant tenant){
        SqlSession sqlSession = DBTools.getSession();
        tenantMapper mapper = sqlSession.getMapper(dao.tenantMapper.class);
        mapper.insertTenant(tenant);
        return true;
    }
}
