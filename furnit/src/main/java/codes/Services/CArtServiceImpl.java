package codes.Services;

import codes.DAO.CartDAO;
import codes.Model.Cart;
import codes.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CArtServiceImpl implements CartService {

    @Autowired
    private CartDAO cartDao;

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart) {
        cartDao.update(cart);
    }
}
