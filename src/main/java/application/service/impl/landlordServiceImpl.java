package application.service.impl;

import application.DO.Landlord;
//import dao.landlordMapper;
//import dao.roomMapper;
//import org.apache.ibatis.session.SqlSession;
import application.DO.Room;
import application.service.LandlordService;

/**
 * Created by sam on 2017/5/16.
 */
public class landlordServiceImpl implements LandlordService {
    
    private static LandlordService land = new landlordServiceImpl();
    private landlordServiceImpl(){};
    public static LandlordService getInstance(){ return land;}

    public boolean createLandlord(Landlord lord) {
//        SqlSession sqlSession = DBTools.getSession();
//        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
//        lordMapper.insert(lord);
//        sqlSession.commit();
        return true;
    }

    public boolean changeInfo(Landlord lord) {
//        SqlSession sqlSession = DBTools.getSession();
//        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
//        lordMapper.updateByPrimaryKey(lord);
//        sqlSession.commit();
        return true;
    }

    public Landlord findlandlord(int landlordid) {
//        SqlSession sqlSession = DBTools.getSession();
//        landlordMapper lordMapper = sqlSession.getMapper(landlordMapper.class);
//        Landlord Landlord = lordMapper.selectByPrimaryKey(landlordid);
        return null;
    }

    public boolean creatRoom(Room room) {
//        SqlSession sqlSession = DBTools.getSession();
//        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
//        mapper.insert(Room);
//        sqlSession.commit();
        return true;
    }

    public boolean deleteRoom(int roomid) {
//        SqlSession sqlSession = DBTools.getSession();
//        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
//        mapper.deleteByPrimaryKey(roomid);
//        sqlSession.commit();
        return true;
    }

    public Room findRoom(int roomid) {
//        SqlSession sqlSession = DBTools.getSession();
//        roomMapper mapper = sqlSession.getMapper(roomMapper.class);
//        Room Room = mapper.selectByPrimaryKey(roomid);
        return null;
    }

}
