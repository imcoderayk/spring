package codes.DAO;

import codes.Model.Cart;

import java.io.IOException;

public interface CartDAO {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
