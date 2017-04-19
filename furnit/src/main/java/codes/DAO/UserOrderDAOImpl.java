package codes.DAO;

import codes.DAO.UserOrderDAO;
import codes.Model.UserOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserOrderDAOImpl implements UserOrderDAO{

        @Autowired
        private SessionFactory sessionFactory;

        public void addUserOrder(UserOrder userOrder) {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(userOrder);
            session.flush();
        }
}
