package codes.Services;

import java.util.List;

import codes.Model.InUsers;

public interface UserService {

	boolean addUser(InUsers u);
	boolean delUser(int uid);
	boolean updUser(InUsers u);
	InUsers getUserById(int uid); 
	List<InUsers> getAllUsers();
}
