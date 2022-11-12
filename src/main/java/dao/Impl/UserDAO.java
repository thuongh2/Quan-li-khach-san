package dao.Impl;

import java.util.List;

import dao.IUserDAO;
import dao.JpaEntityManager;
import model.User;
import model.UserLogin;

public class UserDAO extends JpaEntityManager implements IUserDAO {

	@Override
	public List<User> getAll() {
		return super.getAll(User.class);
	}

	@Override
	public User get(int id) {
		return super.get(User.class, id);
	}

	@Override
	public User getByName(String name) {
		return getCurentSession().get(User.class, name);
	}

	@Override
	public void save(User user) {
		super.save(user);	
	}

	@Override
	public void saveOrUpDate(User user) {
		super.save(user);	
	}

	@Override
	public void delete(User user) {
		super.delete(user);
	}
	
	public void saveUserAndUserLogin(User user, UserLogin userlogin) {
		super.save(userlogin);
		user.setUserLogin(userlogin);	
		super.save(user);
	}
}
