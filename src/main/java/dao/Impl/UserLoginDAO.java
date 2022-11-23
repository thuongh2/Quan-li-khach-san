package dao.Impl;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.IUserLoginDAO;
import dao.JpaEntityManager;
import model.Hotel;
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
	
	public boolean checkLogin(String username, String password) {
		Transaction trans = getCurentSession().beginTransaction();
		Query query = getCurentSession().createQuery("From UserLogin as u where u.username=:username and u.password=:password ");
		query.setParameter("username",username);
		query.setParameter("password",password);
		
		UserLogin user = (UserLogin) query.getResultList().get(0);
		trans.commit();
		if(user != null)
			return true;
		return false;
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
