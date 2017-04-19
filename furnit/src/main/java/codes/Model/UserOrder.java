package codes.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class UserOrder implements Serializable{

    private static final long serialVersionUID = 50L;

    @Id
    @GeneratedValue
    private int userOrderId;

    @OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "customerId")
    private InUsers user;

    public int getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(int userOrderId) {
        this.userOrderId = userOrderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public InUsers getUser() {
        return user;
    }

    public void setUser(InUsers user) {
        this.user = user;
    }
}
