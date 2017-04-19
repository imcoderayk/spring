package codes.DAO;

import codes.DAO.CartDAO;
import codes.Model.Cart;
import codes.Services.UserOrderService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UserOrderService userOrderService;

    public Cart getCartById (int cartId) {
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
        int cartId = cart.getCartId();
        double grandTotal = userOrderService.getUserOrderGrandTotal(cartId);
        cart.setGrandTotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }

    public Cart validate(int cartId) throws IOException {
        Cart cart=getCartById(cartId);
        if(cart==null||cart.getCartItems().size()==0) {
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }
 }
