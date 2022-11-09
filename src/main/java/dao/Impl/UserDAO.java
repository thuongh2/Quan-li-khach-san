package dao.Impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.Transaction;

import dao.IUserDAO;
import dao.JpaEntityManager;
import model.User;

public class UserDAO extends JpaEntityManager implements IUserDAO {

	@Override
	public List<User> getAll() {
		Transaction trans = getCurentSession().beginTransaction();
		List<User> ts = getCurentSession().createNativeQuery("from User").list();
		trans.commit();
		return ts;
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
		super.saveOrUpdate(user);
	}


	@Override
	public void delete(int id) {
		super.delete(id);
	}

}
