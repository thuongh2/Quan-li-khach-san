package dao.Impl;

import java.util.List;
import java.util.UUID;

import dao.IHotelDAO;
import dao.JpaEntityManager;
import model.HotelDetail;
import model.Hotel;

public class HotelDAO extends JpaEntityManager implements IHotelDAO {

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return super.getAll(Hotel.class);
	}

	@Override
	public Hotel get(int id) {
		return super.get(Hotel.class, id);
		
	}

	@Override
	public Hotel getByName(String name) {
		// TODO Auto-generated method stub
		return getCurentSession().get(Hotel.class, name);
	}

	@Override
	public void save(Hotel post) {
		// TODO Auto-generated method stub
		 super.save(post);
		
	}

	@Override
	public void saveOrUpdate(Hotel post) {
		// TODO Auto-generated method stub
		 super.saveOrUpdate(post);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 super.delete(id);
	}
	
	public void savePostAndHotel(Hotel post, HotelDetail hotelDetail) {
		super.save(hotelDetail);
		post.setHotelDetail(hotelDetail);
		super.save(post);
	}

}
