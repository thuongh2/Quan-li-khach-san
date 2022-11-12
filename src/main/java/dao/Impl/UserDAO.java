package dao.Impl;

import java.util.List;

import dao.IHotelDetailDAO;
import dao.IUserDAO;
import dao.JpaEntityManager;
import model.Hotel;
import model.HotelDetail;
import model.User;

public class UserDAO extends JpaEntityManager implements IUserDAO {

	//add git
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(User.class);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return super.get(User.class, id);
	}

	@Override
	public User getByName(String name) {
		// TODO Auto-generated method stub
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

	

}
