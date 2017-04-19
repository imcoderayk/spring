package codes.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codes.DAO.UserDAO;
import codes.Model.InUsers;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO ud;
	
	public boolean addUser(InUsers u) {
		return ud.addUser(u);
	}

	public boolean delUser(int uid) {
		return ud.delUser(uid);
	}

	public boolean updUser(InUsers u) {
		return ud.updUser(u);
	}

	public InUsers getUserById(int uid) {
		return ud.getUserById(uid);
	}

	public List<InUsers> getAllUsers() {
		return ud.getAllUsers();
	}

}
