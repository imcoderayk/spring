package codes.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class InUsers implements Serializable{

	private static final long serialVersionUID = 200L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	private String uname;
	private String uaddr;
	private String upass;
	private String role;
	private boolean enabled;
	
	private Cart cart;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "InUsers [uid=" + uid + ", uname=" + uname + ", uaddr=" + uaddr + ", upass=" + upass + ", role=" + role
				+ ", enabled=" + enabled + "]";
	}
	
}
