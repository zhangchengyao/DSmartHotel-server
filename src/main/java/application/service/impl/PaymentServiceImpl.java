package application.service.impl;

import application.service.PaymentService;

/**
 * Created by zhouchang on 18/4/13.
 */
public class PaymentServiceImpl implements PaymentService{
    @Override
    public boolean transfer2Agency() {
        return false;
    }

    @Override
    public boolean transfer2Landlord() {
        return false;
    }

    @Override
    public boolean refund() {
        return false;
    }
}
