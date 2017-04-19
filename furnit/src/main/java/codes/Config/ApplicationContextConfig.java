package codes.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import codes.Model.Cart;
import codes.Model.CartItem;
import codes.Model.InUsers;
import codes.Model.Product;
import codes.Model.UserOrder;
import codes.Services.CartItemService;
import codes.Services.CartItemServiceImpl;
import codes.Services.CartService;
import codes.Services.CArtServiceImpl;
import codes.Services.ProductService;
import codes.Services.ProductServiceImpl;
import codes.Services.UserOrderService;
import codes.Services.UserOrderServiceImpl;
import codes.Services.UserService;
import codes.Services.UserServiceImpl;

@Configuration
@ComponentScan("com.niit.BackEnd")
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/dt3");

		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
    
   
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "false");
     	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
     	properties.put("hibernate.hbm2ddl.auto", "update");
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClass(Cart.class);
    	sessionBuilder.addAnnotatedClass(CartItem.class);
    	sessionBuilder.addAnnotatedClass(InUsers.class);
    	sessionBuilder.addAnnotatedClass(Product.class);
    	sessionBuilder.addAnnotatedClass(UserOrder.class);
      	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	@Autowired
	@Bean(name="userService")
	public UserService getUserService(){
		return new UserServiceImpl();
	}

	@Autowired
	@Bean(name="cartItemService")
	public CartItemService getCartItemService(){
		return new CartItemServiceImpl();
	}
	
	@Autowired
	@Bean(name="cartService")
	public CartService getCartService(){
		return new CArtServiceImpl();
	}
	
	@Autowired
	@Bean(name="productService")
	public ProductService getProductService(){
		return new ProductServiceImpl();
	}
	
	@Autowired
	@Bean(name="userOrderService")
	public UserOrderService getUserOrderService(){
		return new UserOrderServiceImpl();
	}
}
