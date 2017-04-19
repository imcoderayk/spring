package codes.Services;

import codes.Model.UserOrder;

public interface UserOrderService {

    void addUserOrder(UserOrder userOrder);

    double getUserOrderGrandTotal(int cartId);
}

