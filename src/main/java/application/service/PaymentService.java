package application.service;

/**
 * Created by zhouchang on 18/4/13.
 */
public interface PaymentService {
    public boolean transfer2Agency();
    public boolean transfer2Landlord();
    public boolean refund();
}
