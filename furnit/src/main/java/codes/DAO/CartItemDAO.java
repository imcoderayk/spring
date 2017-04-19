package codes.DAO;

import codes.Model.Cart;
import codes.Model.CartItem;

public interface CartItemDAO {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);

}
