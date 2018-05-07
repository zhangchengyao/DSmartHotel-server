package application.service;

import application.DO.Room;
import application.DO.Tenant;
import application.contracts.Room_sol_Room;
import application.vo.BidInfo;
import application.vo.OrderInfo;

import java.util.List;

/**
 * Created by H77 on 2017/5/15.
 */
public interface TenantService {
    public boolean createTenant(Tenant user);
    public Tenant findTenant(int tenantId);
    public void createAgent(int tenantId);
    public void closeAgent(int tenantId);
    public List<BidInfo> Order(OrderInfo o);
    public List<Room_sol_Room> getRecommendedRooms(int tenantId);
}
