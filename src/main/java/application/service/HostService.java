package application.service;

import application.DO.Landlord;
import application.DO.Room;

/**
 * Created by sam on 2017/5/16.
 *
 */
public interface HostService {
    public boolean createLandlord(Landlord lord);
    public boolean changeInfo(Landlord lord);
    public Landlord findlandlord(int landlordid);


    public boolean creatRoom(Room room);
    public boolean deleteRoom(int roomid);
    public Room findRoom(int roomid);
//    public Room findRoomByLandlordAndType(int landlordid, String type);


}
