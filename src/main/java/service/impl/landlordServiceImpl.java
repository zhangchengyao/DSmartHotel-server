package service.impl;

import DO.landlord;
import dao.landlordMapper;
import dao.roomMapper;
import org.apache.ibatis.session.SqlSession;
import service.LandlordService;
import util.DBTools;

/**
 * Created by sam on 2017/5/16.
 */
public class landlordServiceImpl implements LandlordService {
    
    private static LandlordService land = new landlordServiceImpl();
    private landlordServiceImpl(){};
    public static LandlordService getInstance(){ return land;}

    public boolean createLandlord(landlord lord) {
        SqlSession sqlSession = DBTools.getSession();
        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
        lordMapper.insert(lord);
        sqlSession.commit();
        return true;
    }

    public boolean changeInfo(landlord lord) {
        SqlSession sqlSession = DBTools.getSession();
        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
        lordMapper.updateByPrimaryKey(lord);
        sqlSession.commit();
        return true;
    }

    public landlord findlandlord(int landlordid) {
        SqlSession sqlSession = DBTools.getSession();
        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
        landlord landlord = lordMapper.selectByPrimaryKey(landlordid);
        return landlord;
    }

    public boolean creatRoom(room room) {
        SqlSession sqlSession = DBTools.getSession();
        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
        mapper.insert(room);
        sqlSession.commit();
        return true;
    }

    public boolean deleteRoom(int roomid) {
        SqlSession sqlSession = DBTools.getSession();
        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
        mapper.deleteByPrimaryKey(roomid);
        sqlSession.commit();
        return true;
    }

    public room findRoom(int roomid) {
        SqlSession sqlSession = DBTools.getSession();
        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
        room room = mapper.selectByPrimaryKey(roomid);
        return room;
    }

}
