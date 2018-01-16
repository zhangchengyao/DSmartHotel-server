package service;

import DO.landlord;
import DO.room;

/**
 * Created by sam on 2017/5/16.
 *
 */
public interface LandlordService {
    public boolean createLandlord(landlord lord);
    public boolean changeInfo(landlord lord);
    public landlord findlandlord(int landlordid);


    public boolean creatRoom(room room);
    public boolean deleteRoom(int roomid);
    public room findRoom(int roomid);
//    public room findRoomByLandlordAndType(int landlordid, String type);


}
