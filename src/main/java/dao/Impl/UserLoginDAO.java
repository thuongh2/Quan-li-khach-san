package dao.Impl;

import java.util.List;

import dao.IUserLoginDAO;
import dao.JpaEntityManager;
import model.UserLogin;

public class UserLoginDAO extends JpaEntityManager implements IUserLoginDAO {

	@Override
	public List<UserLogin> getAll() {
		return super.getAll(UserLogin.class);
	}

	@Override
	public UserLogin get(int id) {
		return super.get(UserLogin.class, id);
	}

	@Override
	public void save(UserLogin userlogin) {
		super.save(userlogin);	
	}

	@Override
	public void update(UserLogin userlogin) {
		super.save(userlogin);
	}

	@Override
	public void delete(UserLogin userlogin) {
		super.delete(userlogin);
	}
}
