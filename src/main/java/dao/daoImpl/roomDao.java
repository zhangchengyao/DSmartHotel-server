package dao.daoImpl;

import DO.room;
import dao.roomMapper;
import org.apache.ibatis.session.SqlSession;
import util.DBTools;

/**
 * Created by H77 on 2017/5/28.
 */
public class roomDao {

    public static room findRoomByLandlordAndType(int landlordid, String type){
        SqlSession sqlSession = DBTools.getSession();
        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
        room room = mapper.selectByLandlordIdAndRoomType(landlordid,type);
        return room;
    }
}
