package dao.daoImpl;

import DO.landlord;
import DO.room;
import dao.landlordMapper;
import dao.roomMapper;
import org.apache.ibatis.session.SqlSession;
import util.DBTools;

/**
 * Created by H77 on 2017/5/28.
 */
public class landlordDao {

    public static landlord findlandlordByid(int landlordid){
        SqlSession sqlSession = DBTools.getSession();
        landlordMapper mapper = sqlSession.getMapper(landlordMapper.class);
        landlord land = mapper.selectByPrimaryKey(landlordid);
        return land;
    }
    public static boolean registerLandlord(landlord landlord){
        SqlSession sqlSession = DBTools.getSession();
        landlordMapper mapper = sqlSession.getMapper(landlordMapper.class);
        mapper.insert(landlord);
        return true;
    }

}
