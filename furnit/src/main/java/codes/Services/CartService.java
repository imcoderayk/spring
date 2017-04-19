package codes.Services;

import codes.Model.Cart;

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
