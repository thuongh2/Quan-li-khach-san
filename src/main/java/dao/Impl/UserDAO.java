package dao.Impl;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.IUserDAO;
import dao.JpaEntityManager;
import model.Hotel;
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
		Transaction trans = getCurentSession().beginTransaction();
		String sql = "From User u where u.userLogin.username=:username";
		Query query = getCurentSession().createQuery(sql);

		query.setParameter("username", name);

		List<User> user = query.getResultList();
		trans.commit();
		if(user != null && user.size() > 0)
			return user.get(0);
		return null;
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
