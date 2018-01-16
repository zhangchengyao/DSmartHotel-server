package service;

import DO.tenant;
import vo.BidInfo;
import vo.OrderInfo;

import java.util.List;

/**
 * Created by H77 on 2017/5/15.
 */
public interface TenantService {
    public boolean createTenant(tenant user);
    public tenant findTenant(int tenantId);
    public void createAgent(int tenantId);
    public void closeAgent(int tenantId);
    public List<BidInfo> Order(OrderInfo o);

}
