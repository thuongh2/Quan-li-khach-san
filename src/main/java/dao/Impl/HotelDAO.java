package dao.Impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

	public List<Hotel> getByName(String name) {
		Transaction trans = getCurentSession().beginTransaction();
		Query query = getCurentSession().createQuery("From Hotel rb INNER JOIN rb.hotelDetail where rb.content  like :keyword");
		query.setParameter("keyword","%" + name + "%");
		
		List<Hotel> hotels = query.getResultList();
		trans.commit();
		return hotels;
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
	public void delete(Hotel hotelDeleteHotel) {
		// TODO Auto-generated method stub
		super.delete(hotelDeleteHotel);
	}
	
	

	
	public void savePostAndHotel(Hotel post, HotelDetail hotelDetail) {
		super.save(hotelDetail);
		post.setHotelDetail(hotelDetail);
		super.save(post);
	}
	

}
